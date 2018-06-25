package org.givenness.backend.domain.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.domain.member.valueobj.AuthorityType;


@Data
public class MemberAuthority {


  private long serialNum;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date grantedDate;

  private AuthorityType authorityType;

  private MemberAccount authOwner;


}
