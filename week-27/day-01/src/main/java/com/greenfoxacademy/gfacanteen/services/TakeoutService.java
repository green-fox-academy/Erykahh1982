package com.greenfoxacademy.gfacanteen.services;

import com.greenfoxacademy.gfacanteen.models.Takeout;
import com.greenfoxacademy.gfacanteen.repositories.TakeoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TakeoutService {

  private TakeoutRepository takeoutRepository;

  @Autowired
  public TakeoutService(TakeoutRepository takeoutRepository) {
    this.takeoutRepository = takeoutRepository;
  }

  public ArrayList<String> listOfToppings() {
    ArrayList<String> toppings = new ArrayList<>(Arrays.asList("chicken", "beef", "smoked tofu"));
    return toppings;
  }

  public ArrayList<String> listOfBases() {
    ArrayList<String> bases = new ArrayList<>(Arrays.asList("rice noodles", "edd noodles", "white rice"));
    return bases;
  }

  public void saveAnOrder(Takeout takeout) {
    takeoutRepository.save(takeout);
  }

  public Takeout findTakeoutById(Long id) {
    return takeoutRepository.findTakeoutById(id);
  }

  public boolean isThisOrderIdExists(Long id) {
    return takeoutRepository.existsTakeoutById(id);
  }

  public boolean statusValidation(String status) {
    ArrayList<String> validStatusList = new ArrayList<>(Arrays.asList("inprogress", "done", "ordered"));

    for (String element : validStatusList) {
      if (status.equals(element)) {
        return true;
      }
    }
    return false;
  }

  public ArrayList<Takeout> filteredTakeouts(String queryStatus, String type) {

    ArrayList<Takeout> filteredTakeoutsByStatus = takeoutRepository.findAllByStatus(queryStatus);
    ArrayList<Takeout> filteredReturnTakeouts = new ArrayList<>();

    for (Takeout order : filteredTakeoutsByStatus) {
      if ((order.getTopping().equals("smoked tofu")) && (type.equals("vegetarian"))) {
        filteredReturnTakeouts.add(order);
      }
      if ((type.equals("all"))) {
        filteredReturnTakeouts.add(order);
      }
    }
    return filteredReturnTakeouts;
  }

}
