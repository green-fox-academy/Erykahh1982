package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public ArrayList<Assignee> listAllAssignees() {
    ArrayList<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignees::add);
    return assignees;
  }

  public void saveNewAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public void deleteAssignee(long id) {
    assigneeRepository.deleteById(id);
  }

  public Assignee findAssigneeById(long id) {
    return assigneeRepository.findById(id).get();
  }

  public ArrayList<Assignee> findAssigneeByName(String name) {
    return assigneeRepository.findAssigneeByNameContaining(name);
  }

  public Assignee editAssignee(Assignee assignee){
    return assigneeRepository.save(assignee);
  }
}
