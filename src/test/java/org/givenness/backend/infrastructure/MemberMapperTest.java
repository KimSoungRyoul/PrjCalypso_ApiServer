package org.givenness.backend.infrastructure;


import static org.junit.Assert.assertNotNull;

import lombok.extern.log4j.Log4j;
import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.VolunteerMemberInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Log4j
@Transactional
public class MemberMapperTest {

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
