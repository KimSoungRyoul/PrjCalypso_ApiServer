package org.givenness.backend.domain.member;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.domain.member.valueobj.VolunteerType;


@Entity
@DiscriminatorValue("vol")
@Data
@EqualsAndHashCode(callSuper = true)
public class VolunteerMember extends MemberAccount {

  protected String name;

  @Enumerated(EnumType.STRING)
  protected VolunteerType personalOrOrganization;


  protected String email;

  protected String address;

  protected String phoneNum;

  @OneToMany(mappedBy = "joinedOrganization", fetch = FetchType.LAZY)
  protected List<OrganizationEmployee> empList;

  //private List<VolunteerLog> volunteerLogList;
}
