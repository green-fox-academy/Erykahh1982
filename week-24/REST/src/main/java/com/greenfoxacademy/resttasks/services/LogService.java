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

  public ArrayList<Log> listLogsPerCount(Integer count) {
    ArrayList<Log> orderedFullList = logRepository.findAllByOrderByCreatedAtDesc();
    ArrayList<Log> listOnlyLatestX = new ArrayList<>();

    for (int i = 0; i < count; i++) {
      listOnlyLatestX.add(orderedFullList.get(i));
    }
    return listOnlyLatestX;
  }

  public String statusToPrintLatestX(Integer count) {
    if (listLogsPerCount(count).isEmpty()) {
      return "No logs have been created so far!!";
    }

    String toPrint = "entries : ";
    for (Log log : listLogsPerCount(count)) {
      toPrint += log.toString() + ",";
    }
    toPrint += "entry_count : " + listLogsPerCount(count).size();

    return toPrint;
  }

  public ArrayList<Log> listLogsPerPage(Integer page) {
    ArrayList<Log> orderedFullList = logRepository.findAllByOrderByCreatedAtDesc();
    ArrayList<Log> listOf10Bunch = new ArrayList<>();
    int fullListSize = orderedFullList.size();
    int listLogsFrom = (page - 1) * 10;
    int listLogsTill = 0;

    if ((fullListSize % 10) == 0) {
      listLogsTill = listLogsFrom + 9;
      for (int i = listLogsFrom; i <= listLogsTill; i++) {
        listOf10Bunch.add(orderedFullList.get(i));
      }
    }

    if ((fullListSize % 10) > 0) {
      listLogsTill = listLogsFrom + (fullListSize % 10);
      for (int i = listLogsFrom; i < listLogsTill; i++) {
        listOf10Bunch.add(orderedFullList.get(i));
      }
    }
    return listOf10Bunch;
  }

  public String statusToPrintPerPage(Integer page) {

    if (listLogsPerPage(page).isEmpty()) {
      return "No logs have been created so far!!";
    }

    String toPrint = "entries : ";
    for (Log log : listLogsPerPage(page)) {
      toPrint += log.toString() + ",";
    }
    toPrint += "entry_count : " + listLogsPerPage(page).size();

    return toPrint;
  }
}
