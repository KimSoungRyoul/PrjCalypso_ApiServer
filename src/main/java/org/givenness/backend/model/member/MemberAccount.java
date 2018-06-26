package org.givenness.backend.model.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.Set;
import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
@Alias("memberAccount")
public class MemberAccount {


  protected String memberId;
  protected String password;

  protected Set<MemberAuthority> grantedAuthList;
  protected String passwordHint;
  protected String passwordHintAnswer;

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  protected Date regDate;

  protected ProfileImage profileImage;

  @JsonIgnore
  private long serialNum;

}
