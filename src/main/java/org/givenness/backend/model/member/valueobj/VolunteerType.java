package org.givenness.backend.model.member.valueobj;

import lombok.Getter;
import lombok.Setter;

public enum VolunteerType {
  PERSONAL(0),
  COMPANY(1);


  @Getter
  @Setter
  private final int pOrC;

  VolunteerType(int pOrC) {
    this.pOrC = pOrC;


  }


  public static VolunteerType valueOf(int value) {
    switch (value) {
      case 1:
        return VolunteerType.PERSONAL;
      case 2:
        return VolunteerType.COMPANY;
      default:
        throw new AssertionError("Unknown VolunteerType!!: " + value);
    }
  }

}
