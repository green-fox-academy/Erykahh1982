package com.greenfoxacademy.springstart.listingtodos.repository;

import com.greenfoxacademy.springstart.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
