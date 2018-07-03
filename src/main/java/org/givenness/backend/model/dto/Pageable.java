package org.givenness.backend.model.dto;

import lombok.Getter;
import lombok.Setter;

public class Pageable {

  private static final int SIZE = 10;

  @Setter
  private int pageNum;

  @Getter
  private int startLimitNum;
  @Getter
  private int endLimitNum;

  @Getter
  private String sortBy;

  public Pageable(int pageNum) {
    this.pageNum = pageNum;
    this.sortBy = "serial_num";

    startLimitNum = SIZE * (pageNum - 1);
    endLimitNum = SIZE * (pageNum);
  }

  public Pageable(int pageNum, String sortBy) {
    this.pageNum = pageNum;
    this.sortBy = sortBy;

    startLimitNum = SIZE * (pageNum - 1);
    endLimitNum = SIZE * (pageNum);
  }
}
