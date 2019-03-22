package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public ArrayList<Todo> findTodosByTitleContaining(String wordPart);
  public ArrayList<Todo> findTodosByAssignee(Assignee assignee);
}
