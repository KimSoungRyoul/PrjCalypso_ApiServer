package org.givenness.backend.service;


import org.givenness.backend.persistence.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  @Autowired
  private MemberMapper memberMapper;


  public void sdf() {

    memberMapper.selectMember(1);

  }

}
