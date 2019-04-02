package com.greenfoxacademy.resttasks.repositories;

import com.greenfoxacademy.resttasks.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
  ArrayList<Log> findTop10ByOrderByCreatedAtDesc();

  ArrayList<Log> findAllByOrderByCreatedAtDesc();
}