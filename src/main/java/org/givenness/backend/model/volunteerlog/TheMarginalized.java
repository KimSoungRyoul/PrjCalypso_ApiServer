package org.givenness.backend.model.volunteerlog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.model.member.TheMarginalizedAdminMember;
import org.givenness.backend.model.volunteerlog.valueobj.MarginalizedType;


@Data
//소외 계층
public class TheMarginalized {


  private long serialNum;


  private TheMarginalizedAdminMember marginalizedManager;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;


  private MarginalizedType marginalizedType;

  private String name;


}
