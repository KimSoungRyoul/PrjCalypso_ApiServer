package org.givenness.backend.domain.member;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("m_admin")
@Data
@EqualsAndHashCode(callSuper = true)
public class TheMarginalizedAdminMember extends MemberAccount {


  protected String adminDepartmentName;


  protected String email;

  protected String address;

  protected String phoneNum;

  //protected Set<TheMarginalized> theMarginalizedSet;


}
