package org.givenness.backend.model.member;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@ApiModel(value = "ProfileImage", description = "회원 프로필사진또는 회사로고")
@NoArgsConstructor
public class ProfileImage extends FileInfo {

  /* //회원 사진 소유 계정 정보는 json 이미 회원 정보에 포함되어있음
  @ApiModelProperty(name = "프로필사진 소유 계정")
  @JsonIgnore
  protected MemberAccount imageOwner;*/

  public ProfileImage(long fileSerialNum) {

    this.serialNum = fileSerialNum;
  }
}
