package org.givenness.backend.domain.member;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.domain.member.valueobj.VolunteerType;


@Data
@EqualsAndHashCode(callSuper = true)
public class VolunteerMember extends MemberAccount {

  protected String name;


  protected VolunteerType personalOrOrganization;


  protected String email;

  protected String address;

  protected String phoneNum;


  protected List<OrganizationEmployee> empList;

  //private List<VolunteerLog> volunteerLogList;
}
