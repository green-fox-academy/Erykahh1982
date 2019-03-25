package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public ArrayList<User> listAllUsers() {
    ArrayList<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  public void saveUser(User user) {
    userRepository.save(user);
  }

  public void deleteUser(User user) {
    userRepository.delete(user);
  }

}
