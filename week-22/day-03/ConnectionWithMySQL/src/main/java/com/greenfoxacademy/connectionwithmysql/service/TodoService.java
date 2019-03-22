package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
    LocalDateTime timestamp = LocalDateTime.now().plusDays(todo.getDays());
    todo.setDueDate(timestamp);
    todoRepository.save(todo);
  }

  public void deleteTodo(long id) {
    todoRepository.deleteById(id);
  }

  public Todo findTodoById(long id) {
    return todoRepository.findById(id).get();
  }

  public void editTodo(Todo todo, long id) {
    todo.setUpdateTime(LocalDateTime.now());
    todoRepository.save(todo);
  }

  public ArrayList<Todo> searchForTodo(String wordPart) {
    return todoRepository.findTodosByTitleContaining(wordPart);
  }

  public ArrayList<Todo> findTodosByAssignee(Assignee assignee) {
    return todoRepository.findTodosByAssignee(assignee);
  }
}
