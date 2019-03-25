package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import org.hibernate.mapping.TableOwner;
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

  public void saveNewPost(Post post) {
    post.setNrOfVotes((long) 0);
    postRepository.save(post);
  }

  public void deletePost(Post post) {
    postRepository.delete(post);
  }

  public Post findPostById(long id) {
    return postRepository.findById(id).get();
  }

  public void upvotePost(long id, Post post, long sore) {
    post.setNrOfVotes(post.getNrOfVotes() + sore);
    postRepository.save(post);
  }

  public void downvotePost(long id, Post post, long sore) {
    post.setNrOfVotes(post.getNrOfVotes() - sore);
    postRepository.save(post);
  }
}
