package com.greenfoxacademy.resttasks.services;

import ch.qos.logback.classic.pattern.LineOfCallerConverter;
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

  public int calculateNumberOfLogs() {
    return listAllLogs().size();
  }

  public String statusToPrint() {
    if (listAllLogs().isEmpty()) {
      return "No logs have been created so far!!";
    }

    String toPrint = "entries : ";

    for (Log log : listAllLogs()) {
      toPrint += log.toString() + ",";
    }

    toPrint += "entry_count : " + calculateNumberOfLogs();
    return toPrint;
  }

  public ArrayList<Log> listLatest10LogsOnly() {
    return logRepository.findTop10ByOrderByCreatedAtDesc();
  }

  public String statusToPrintLatest10() {
    if (listLatest10LogsOnly().isEmpty()) {
      return "No logs have been created so far!!";
    }

    String toPrint = "entries : ";

    for (Log log : listLatest10LogsOnly()) {
      toPrint += log.toString() + ",";
    }

    toPrint += "entry_count : " + listLatest10LogsOnly().size();
    return toPrint;
  }

  public ArrayList<Log> logsOrderedByCreatedAtDesc(Integer count) {
    ArrayList<Log> orderedFullList = logRepository.findAllByOrderByCreatedAtDesc();
    ArrayList<Log> listOnlyLatestX = new ArrayList<>();
    int fullListSize = orderedFullList.size();

    for (int i = 0; i < count; i++) {
      listOnlyLatestX.add(orderedFullList.get(i));
    }
    return listOnlyLatestX;
  }

  public String statusToPrintLatestX(Integer count) {
    if (logsOrderedByCreatedAtDesc(count).isEmpty()) {
      return "No logs have been created so far!!";
    }

    String toPrint = "entries : ";

    for (Log log : logsOrderedByCreatedAtDesc(count)) {
      toPrint += log.toString() + ",";
    }

    toPrint += "entry_count : " + logsOrderedByCreatedAtDesc(count).size();
    return toPrint;
  }


}
