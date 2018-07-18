package org.givenness.backend.presentation.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
@ApiModel(value = "theMarginalizedAdminMember", description = "소외계층관리자 계정 ")
public class MAdminMemberDTO {

  @ApiModelProperty(value = "회원의 아이디", example = "sky5367@gmail.com", dataType = "string")
  protected String memberId;

  @ApiModelProperty(value = "비밀번호 ", example = "1q2w3e4r", dataType = "string", notes = "국방부급 보안레벨 암호")
  protected String password;

  protected String passwordHint;

  protected String passwordHintAnswer;

  @ApiModelProperty(value = "단체 로고", dataType = "long")
  protected long profileImageSerialNum;


  protected String adminDepartmentName;

  protected String email;

  protected String address;

  protected String phoneNum;


}
