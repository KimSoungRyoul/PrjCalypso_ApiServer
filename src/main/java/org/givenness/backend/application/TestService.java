package org.givenness.backend.application;


import org.givenness.backend.infrastructure.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  @Autowired
  private MemberMapper memberMapper;


  public void sdf() {

    memberMapper.selectMember("sdf");

  }

}
