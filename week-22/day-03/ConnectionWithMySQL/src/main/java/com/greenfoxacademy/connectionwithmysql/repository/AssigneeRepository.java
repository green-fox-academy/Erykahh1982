package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  public ArrayList<Assignee> findAssigneeByNameContaining(String name);
}
