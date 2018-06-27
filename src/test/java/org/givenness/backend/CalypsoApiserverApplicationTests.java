package org.givenness.backend;

import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class CalypsoApiserverApplicationTests {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void contextLoads() {

        memberMapper.selectMember(1);


    }

}
