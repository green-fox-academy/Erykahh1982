package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrickService {

  private FoxRepository foxRepository;
  private TrickRepository trickRepository;

  @Autowired
  public TrickService(FoxRepository foxRepository, TrickRepository trickRepository) {
    this.foxRepository = foxRepository;
    this.trickRepository = trickRepository;
  }

  public void addNewTrick(Trick trick) {
    trickRepository.addTrick(trick);
  }

}
