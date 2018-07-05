package org.givenness.backend.infrastructure;


import static org.junit.Assert.assertNotNull;

import lombok.extern.log4j.Log4j;
import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.givenness.backend.model.member.MemberAccount;
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
    log.info("---MemberMapperTest Start--- \n\n");
  }

  @After
  public void finish() {

    log.info("---MemberMapperTest END--- \n\n");

  }

  @Test
  public void selectMember() {

    MemberAccount memberAccount = memberMapper.selectMember("sdf");

    log.info(memberAccount.toString());

    assertNotNull(memberAccount);

  }

  @Test
  public void selectVolunteerInfo() {

    VolunteerMemberInfo volunteerMemberInfo = memberMapper.selectPersonalVolunteerInfo("sdf");

    log.info(volunteerMemberInfo.toString());

    assertNotNull(volunteerMemberInfo);

  }

}
