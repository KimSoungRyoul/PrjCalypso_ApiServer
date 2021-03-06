package org.givenness.backend.model.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;


@Data
public class OrganizationEmployee {

  //public VolunteerMemberInfo joinedOrganization;

  private long serialNum;

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;
  private String department;
  private String name;

}
