package org.givenness.backend.model.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.member.valueobj.AuthorityType;


@Data
@EqualsAndHashCode
public class MemberAuthority {


  private long serialNum;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date grantedDate;

  private AuthorityType authorityType;

  private MemberAccount authOwner;


}
