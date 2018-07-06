package org.givenness.backend.model.member;


import io.swagger.annotations.ApiModel;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.volunteerlog.TheMarginalized;


@Data
@EqualsAndHashCode
@ApiModel(value = "theMarginalizedAdminMember", description = "소외계층 관리자 계정")
public class TheMarginalizedAdminMemberInfo {

  protected long serialNum;

  protected String memberId;


  protected String adminDepartmentName;

  protected String email;

  protected String address;

  protected String phoneNum;

  protected Set<TheMarginalized> theMarginalizedSet;


}
