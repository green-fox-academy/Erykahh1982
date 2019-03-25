package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
