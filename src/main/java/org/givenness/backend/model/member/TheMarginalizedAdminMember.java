package org.givenness.backend.model.member;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "theMarginalizedAdminMember", description = "소외계층 관리자 계정")
public class TheMarginalizedAdminMember extends MemberAccount {


  protected String adminDepartmentName;

  protected String email;

  protected String address;

  protected String phoneNum;

  //protected Set<TheMarginalized> theMarginalizedSet;


}
