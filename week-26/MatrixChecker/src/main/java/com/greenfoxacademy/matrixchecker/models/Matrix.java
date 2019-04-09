package com.greenfoxacademy.matrixchecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private LocalDateTime date;
  private int[][] matrixNumbers;

  public Matrix() {
    this.date = LocalDateTime.now();
  }

  public Matrix(int[][] squareMatrix) {
    this.matrixNumbers = squareMatrix;
    this.date = LocalDateTime.now();
  }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public int[][] getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(int[][] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }



}
