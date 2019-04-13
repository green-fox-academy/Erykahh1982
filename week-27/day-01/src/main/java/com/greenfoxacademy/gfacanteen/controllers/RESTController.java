package com.greenfoxacademy.gfacanteen.controllers;

import com.greenfoxacademy.gfacanteen.models.Takeout;
import com.greenfoxacademy.gfacanteen.models.Update;
import com.greenfoxacademy.gfacanteen.services.TakeoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RESTController {

  private TakeoutService takeoutService;

  @Autowired
  public RESTController(TakeoutService takeoutService) {
    this.takeoutService = takeoutService;
  }

  @PatchMapping("/api/orders/{id}")
  public ResponseEntity<Object> updateOrderStatus(@PathVariable long id,
                                                  @RequestBody Update update) {

    if (!takeoutService.isThisOrderIdExists(id)) {
      return ResponseEntity.status(400).body("No order exists with this ID");
    }
    if ((update.getStatus().equals("") || (update.getStatus() == null))) {
      return ResponseEntity.status(400).body("No update message have arrived or update message is empty");
    }
    if (!takeoutService.statusValidation(update.getStatus())) {
      return ResponseEntity.status(400).body("Validation failed, no such status exists");
    } else {
      Takeout selectedTakeout = takeoutService.findTakeoutById(id);
      selectedTakeout.setStatus(update.getStatus());
      takeoutService.saveAnOrder(selectedTakeout);
    }
    return ResponseEntity.status(200).body("Order status successfully updated to " + update.getStatus());
  }

  @GetMapping("/api/orders")
  public ResponseEntity<Object> customSearch(@RequestParam(required = false) String type,
                                             @RequestParam(value = "status", required = false) String status) {

    ArrayList<Takeout> filteredList = takeoutService.filteredTakeouts(status, type);

    if (type == null && status == null) {
      return ResponseEntity.status(400).body("No query parameters have arrived at all");
    }
    if (type == null || type.equals("")) {
      return ResponseEntity.status(400).body("No type parameter have arrived");
    }
    if (status == null || status.equals("")) {
      return ResponseEntity.status(400).body("No status parameter have arrived");
    }
    if (filteredList.size() == 0) {
      return ResponseEntity.status(400).body("No matching order exists, the list is empty");
    }
    return ResponseEntity.status(200).body(filteredList);
  }

}