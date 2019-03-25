package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
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
}
