package com.greenfoxacademy.resttasks.repositories;

import com.greenfoxacademy.resttasks.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
