package org.givenness.backend.model.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.Set;
import lombok.Data;


@Data
@ApiModel(value = "memberAccount", description = "회원 인증관련 정보")
public class MemberAccount {


  @ApiModelProperty(value = "회원의 아이디", example = "sky5367@gmail.com", dataType = "string")
  protected String memberId;

  @ApiModelProperty(value = "비밀번호 ", example = "1q2w3e4r", dataType = "string", notes = "국방부급 보안레벨 암호")
  protected String password;


  protected Set<MemberAuthority> grantedAuthList;


  protected String passwordHint;

  protected String passwordHintAnswer;

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  protected Date regDate;

  @ApiModelProperty(value = "회원 프로필사진 관련 정보", dataType = "ProfileImage", reference = "ProfileImage")
  protected ProfileImage profileImage;

  @JsonIgnore
  private long serialNum;

}
