package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public long incrementVotes(long id) {
    long incrementedVotes = postRepository.findById(id).get().getNrOfVotes();
    incrementedVotes++;
    return incrementedVotes;
  }

  public long decrementVotes(long id) {
    long decrementedVotes = postRepository.findById(id).get().getNrOfVotes();
    decrementedVotes--;
    return decrementedVotes;
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

  public ArrayList<Post> listAllOrderByScore() {
    ArrayList<Post> orderedList = postRepository.findAllByOrderByNrOfVotesDesc();
    return orderedList;
  }

  public ArrayList<Post> listTop10Posts() {
    ArrayList<Post> topTenPosts = new ArrayList<>();
    ArrayList<Post> allPosts = listAllOrderByScore();
    int fullListSize = allPosts.size();

    if (fullListSize >= 10) {
      for (int i = 10; i > 0; i--) {
        topTenPosts.add(allPosts.get(fullListSize - i));
      }
    } else {
      topTenPosts = allPosts;
    }
    return topTenPosts;
  }
}
