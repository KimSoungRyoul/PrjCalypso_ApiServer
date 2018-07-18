package org.givenness.backend.presentation.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.member.valueobj.VolunteerType;

@Data
@EqualsAndHashCode
@ApiModel(value = "volunteerMember", description = "자원봉사자 계정 ")
public class VolunteerMemberDTO {


  @ApiModelProperty(value = "회원의 아이디", example = "sky5367@gmail.com", dataType = "string")
  protected String memberId;

  @ApiModelProperty(value = "비밀번호 ", example = "1q2w3e4r", dataType = "string", notes = "국방부급 보안레벨 암호")
  protected String password;

  protected String passwordHint;

  protected String passwordHintAnswer;


  @ApiModelProperty(value = "회원 프로필사진 관련 정보", dataType = "long")
  protected long profileImageSerialNum;


  protected String name;

  protected VolunteerType personalOrOrganization;

  protected String email;

  protected String address;

  protected String phoneNum;


}
