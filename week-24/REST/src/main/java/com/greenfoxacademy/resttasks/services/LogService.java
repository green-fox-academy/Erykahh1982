package com.greenfoxacademy.resttasks.services;

import com.greenfoxacademy.resttasks.models.Log;
import com.greenfoxacademy.resttasks.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LogService {

  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void saveLog(Log log) {
    logRepository.save(log);
  }

  public ArrayList<Log> listAllLogs() {
    ArrayList<Log> logs = new ArrayList<>();
    logRepository.findAll().forEach(logs::add);
    return logs;
  }

  public int calculateNumberOfLogs(ArrayList<Log> logs) {
    return logs.size();
  }
}