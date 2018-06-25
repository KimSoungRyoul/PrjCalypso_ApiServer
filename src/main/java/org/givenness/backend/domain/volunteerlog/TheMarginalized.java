package org.givenness.backend.domain.volunteerlog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.domain.member.TheMarginalizedAdminMember;
import org.givenness.backend.domain.volunteerlog.valueobj.MarginalizedType;


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
