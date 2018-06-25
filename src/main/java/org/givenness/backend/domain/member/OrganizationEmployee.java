package org.givenness.backend.domain.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;


@Data
public class OrganizationEmployee {


  public VolunteerMember joinedOrganization;

  private long serialNum;

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;
  private String department;
  private String name;

}
