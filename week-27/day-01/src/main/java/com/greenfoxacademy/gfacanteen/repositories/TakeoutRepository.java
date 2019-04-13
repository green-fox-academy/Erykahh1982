package com.greenfoxacademy.gfacanteen.repositories;

import com.greenfoxacademy.gfacanteen.models.Takeout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TakeoutRepository extends CrudRepository<Takeout, Long> {

  Takeout findTakeoutById(Long id);

  boolean existsTakeoutById(Long id);

  ArrayList<Takeout> findAllByStatus(String status);
}
