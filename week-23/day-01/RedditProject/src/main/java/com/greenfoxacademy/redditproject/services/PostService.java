package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public ArrayList<Post> listAllPosts() {
    ArrayList<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  public void savePost(Post post) {
    postRepository.save(post);
  }

  public void deletePost(Post post) {
    postRepository.delete(post);
  }

  public void editPost(Post post, long id) {
    postRepository.save(post);
  }

  public Post findPostById(long id) {
    return postRepository.findById(id).get();
  }

  public void upvotePost(long id) {
    if (findPostById(id) != null) {
      Post post = findPostById(id);
      post.setNrOfVotes(post.getNrOfVotes() + 1);
      savePost(post);
    }
  }

  public void downvotePost(long id) {
    if (findPostById(id) != null) {
      Post post = findPostById(id);
      post.setNrOfVotes(post.getNrOfVotes() - 1);
      savePost(post);
    }
  }

  public ArrayList<Post> listPostsByUser(User user) {
    return postRepository.findAllByUserOrderByNrOfVotesDesc(user);
  }

  public ArrayList<Post> listAllPostsByPopularity() {
    return postRepository.findAllByOrderByNrOfVotesDesc();
  }

  public ArrayList<Post> listTop10OrderByScore() {
    ArrayList<Post> orderedList = postRepository.findTop10ByOrderByNrOfVotesDesc();
    return orderedList;
  }

  public int calculateNumberOfPagesForPagination() {
    int numberOfPages = 0;
    ArrayList<Post> posts = postRepository.findAllByOrderByNrOfVotesDesc();

    if (posts.isEmpty()) {
      numberOfPages = 1;
    } else if ((posts.size() % 10) > 0) {
      numberOfPages = (posts.size() / 10) + 1;
    } else {
      numberOfPages = posts.size() / 10;
    }
    return numberOfPages;
  }

  public ArrayList createArrayListForPossiblePageNumbers() {
    int pageNumber = calculateNumberOfPagesForPagination();

    ArrayList<Integer> howmanypagestocreate = new ArrayList<>();
    for (int i = 1; i <= pageNumber; i++) {
      howmanypagestocreate.add(i);
    }
    return howmanypagestocreate;
  }

  public ArrayList<Post> listPostsForPagination(Integer pagenumber) {
    ArrayList<Post> orderedList = listAllPostsByPopularity();
    ArrayList<Post> listOf10Bunch = new ArrayList<>();
    int numberOfPosts = orderedList.size();
    int from = (pagenumber - 1) * 10;
    int to = 0;

    if ((pagenumber < calculateNumberOfPagesForPagination()) || ((numberOfPosts % 10) == 0)) {
      to = from + 9;
      for (int i = from; i <= to; i++) {
        listOf10Bunch.add(orderedList.get(i));
      }
    }

    if ((pagenumber == calculateNumberOfPagesForPagination()) && ((numberOfPosts % 10) > 0)) {
      to = from + (numberOfPosts % 10);
      for (int i = from; i < to; i++) {
        listOf10Bunch.add(orderedList.get(i));
      }
    }

    return listOf10Bunch;
  }

}
