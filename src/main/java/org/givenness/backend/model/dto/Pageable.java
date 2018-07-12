package org.givenness.backend.model.dto;

import lombok.Getter;

public class Pageable {

  private static final int SIZE = 10;


  private int pageNum;

  @Getter
  private int startLimitNum;
  @Getter
  private int endLimitNum;

  @Getter
  private String searchKeyword;

  public Pageable(int pageNum) {
    this.pageNum = pageNum;


    startLimitNum = SIZE * (pageNum - 1);
    endLimitNum = SIZE * (pageNum);
  }


  public Pageable(int pageNum, String searchKeyword) {
    this.pageNum = pageNum;
    this.searchKeyword = searchKeyword;

    startLimitNum = SIZE * (pageNum - 1);
    endLimitNum = SIZE * (pageNum);
  }
}
