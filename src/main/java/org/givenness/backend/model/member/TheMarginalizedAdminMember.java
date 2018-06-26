package org.givenness.backend.model.member;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class TheMarginalizedAdminMember extends MemberAccount {


  protected String adminDepartmentName;

  protected String email;

  protected String address;

  protected String phoneNum;

  //protected Set<TheMarginalized> theMarginalizedSet;


}
