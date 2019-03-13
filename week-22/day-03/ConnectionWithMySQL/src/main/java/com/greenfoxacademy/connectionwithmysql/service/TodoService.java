package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public ArrayList<Todo> listAllItems() {
    ArrayList<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  public ArrayList<Todo> listDoneItems() {
    ArrayList<Todo> todos = listAllItems();
    ArrayList<Todo> uncompletedTodos = new ArrayList<>();

    for (Todo todo : todos) {
      if (!todo.isDone()) {
        uncompletedTodos.add(todo);
      }
    }
    return uncompletedTodos;
  }

  public void saveNewTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodo(long id){
    todoRepository.deleteById(id);
  }

}
