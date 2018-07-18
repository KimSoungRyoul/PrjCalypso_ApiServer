package org.givenness.backend.model.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.member.valueobj.VolunteerType;

@Data
@EqualsAndHashCode
@ApiModel(value = "volunteerMember", description = "자원봉사자 계정 ")
public class VolunteerMemberInfo {

  protected long serialNum;

  protected String memberId;

  protected String name;

  protected VolunteerType personalOrOrganization;

  protected String email;

  protected String address;

  protected String phoneNum;

  protected List<OrganizationEmployee> empList;

  @ApiModelProperty(value = "회원 프로필사진 관련 정보", dataType = "ProfileImage", reference = "ProfileImage")
  protected ProfileImage profileImage;

  // private List<VolunteerLog> volunteerLogList;
}
