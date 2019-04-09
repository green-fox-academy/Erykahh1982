package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MatrixController {

  private MatrixService matrixService;

  @Autowired
  public MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String renderMainPage() {
    return "main";
  }

  @PostMapping("/matrix")
  public String validateAndSaveMatrixToDB(@ModelAttribute(value = "matrixNumbers") String input,
                                          Model model) {

    if (input.equals("") || input.equals(null)) {
      model.addAttribute("error", "No parameter have been provided");
      return "main";
    }

    if (!matrixService.isThisASquareMatrix(input)) {
      model.addAttribute("notSquareMatrix", "This is not a square matrix");
    } else if (matrixService.isThisASquareMatrix(input)) {
      Matrix matrix = new Matrix(matrixService.generateIntMatrix(matrixService.splitInputPerEnters(input)));
      if (!matrixService.isTheMatrixIncreasing(matrix.getMatrixNumbers())) {
        model.addAttribute("notIncreasing", "This matrix is not increasing, try another one");
      } else {
        model.addAttribute("success", "Your matrix is increasing, records successfully saved in database!");
        matrixService.saveMatrix(matrix);
      }
    }
    return "main";
  }

  @GetMapping("/matrices")
  @ResponseBody
  public Object listMatrices() {
    ArrayList<Matrix> matrices = matrixService.listAllMatrices();

    if (matrices.isEmpty()) {
      return ResponseEntity.status(404).body("The database is currently out of matrices");
    } else {
      return ResponseEntity.status(200).body(matrices);
    }
  }

}
