package com.greenfoxacademy.matrixchecker.services;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import com.greenfoxacademy.matrixchecker.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MatrixService {

  private MatrixRepository matrixRepository;

  @Autowired
  public MatrixService(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

  public ArrayList<Matrix> listAllMatrices() {
    ArrayList<Matrix> matrices = new ArrayList<>();
    matrixRepository.findAll().forEach(matrices::add);
    return matrices;
  }

  public String[] splitInputPerEnters(String input) {
    String[] inputRows = input.split("\r\n");
    return inputRows;
  }

  public boolean isThisASquareMatrix(String input) {

    String[] stringArrayFromInput = splitInputPerEnters(input);
    int numberOfRows = stringArrayFromInput.length;
    int numberOfEntry = 0;

    for (int i = 0; i < numberOfRows; i++) {
      numberOfEntry = stringArrayFromInput[i].length();
      if (numberOfEntry != numberOfRows)
        return false;
    }
    return true;
  }

  public int[][] generateIntMatrix(String[] rows) {
    int[][] matrix = new int[rows.length][rows.length];
    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < rows[i].length(); j++) {
        matrix[i][j] = Character.getNumericValue(rows[i].charAt(j));
      }
    }
    return matrix;
  }

  public boolean isMatrixRowIncreasing(int[][] matrixOfIntegers) {

    for (int i = 0; i < matrixOfIntegers.length; i++) {
      for (int j = 0; j < matrixOfIntegers[i].length - 1; j++) {
        if (matrixOfIntegers[i][j] > matrixOfIntegers[i][j + 1]) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isMatrixColumnIncreasing(int[][] matrixOfIntegers) {

    for (int j = 0; j < matrixOfIntegers.length; j++) {
      for (int i = 0; i < matrixOfIntegers[j].length - 1; i++) {
        if (matrixOfIntegers[i][j] > matrixOfIntegers[i + 1][j]) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isTheMatrixIncreasing(int[][] matrixOfIntegers) {
    return (isMatrixColumnIncreasing(matrixOfIntegers) && isMatrixRowIncreasing(matrixOfIntegers));
  }
}


