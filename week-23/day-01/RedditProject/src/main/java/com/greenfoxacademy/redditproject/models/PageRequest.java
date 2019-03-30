package com.greenfoxacademy.redditproject.models;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;

public class PageRequest implements Pageable {

  private int pageNumber;
  private int pageSize;

  public PageRequest() {
  }

  public PageRequest(int pageNumber, int pageSize) {
    this.pageNumber = pageNumber;
    this.pageSize = pageSize;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public int getNumberOfPages() {
    return 0;
  }

  @Override
  public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
    return null;
  }

  @Override
  public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
    return null;
  }
}
