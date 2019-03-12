package com.greenfoxacademy.springstart.listingtodos.repository;

import com.greenfoxacademy.springstart.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
