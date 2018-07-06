package org.givenness.backend.infrastructure;


import static org.junit.Assert.assertNotNull;

import lombok.extern.log4j.Log4j;
import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.TheMarginalizedAdminMemberInfo;
import org.givenness.backend.model.member.VolunteerMemberInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;


@Log4j
@ActiveProfiles("dev")
public class MemberMapperTest extends DefaultAbstractTest {

  @Autowired
  private MemberMapper memberMapper;


  @Before
  public void init() {

    log.info("---MemberMapperTest 단위테스트 시작--- \n\n");

  }

  @After
  public void finish() {

    log.info("---MemberMapperTest 단위테스트 종료--- \n\n");

  }

  @Test
  public void selectMember() {

    MemberAccount memberAccount = memberMapper.selectMember("sdf");
    MemberAccount memberAccount2 = memberMapper.selectMember("qwer");

    log.info(memberAccount.toString());
    log.info(memberAccount2.toString());

    assertNotNull(memberAccount);
    assertNotNull(memberAccount2);

  }

  @Test
  public void selectVolunteerInfo() {

    VolunteerMemberInfo volunteerMemberInfo = memberMapper.selectPersonalVolunteerInfo("sdf");

    log.info(volunteerMemberInfo.toString());

    assertNotNull(volunteerMemberInfo);

  }

  @Test
  public void selectCompanyVolunteerInfo() {

    VolunteerMemberInfo volunteerMemberInfo = memberMapper.selectCompanyVolunteerInfo("sdf");

    log.info(volunteerMemberInfo.toString());

    assertNotNull(volunteerMemberInfo.getEmpList());

  }

  @Test
  public void selectMAdminInfo() {

    TheMarginalizedAdminMemberInfo mAdminInfo = memberMapper.selectMAdminInfo("qwer");

    log.info(mAdminInfo.toString());

    assertNotNull(mAdminInfo);

  }


}
