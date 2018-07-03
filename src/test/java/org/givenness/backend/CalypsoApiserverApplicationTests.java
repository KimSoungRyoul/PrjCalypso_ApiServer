package org.givenness.backend;

import lombok.extern.log4j.Log4j;
import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.givenness.backend.model.member.MemberAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Log4j
public class CalypsoApiserverApplicationTests {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void contextLoads() {

      MemberAccount memberAccount = memberMapper.selectMember("sdf");
      log.info(memberAccount.toString());

    }

}
