package com.prj.calypso_apiserver.domain.member;

import com.prj.calypso_apiserver.domain.volunteerlog.VolunteerLog;
import java.util.List;
import java.util.Set;

public class VolunteerMember extends MemberAccount {

  protected String name;

  // c Or o
  protected char personalOrOrganization;

  protected String passwordHint;
  protected String passwordHintAnswer;

  protected String email;

  protected String address;

  protected String phoneNum;

  protected Set<OrganizationEmployee> empList;

  private List<VolunteerLog> volunteerLogList;
}
