package com.greenfoxacademy.redditproject.repositories;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  ArrayList<Post> findAllByUserOrderByNrOfVotesDesc(User user);

  ArrayList<Post> findAllByOrderByNrOfVotesDesc();

  ArrayList<Post> findTop10ByOrderByNrOfVotesDesc();

}
