package org.givenness.backend.infrastructure.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.givenness.backend.model.member.MemberAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {

  MemberAccount createMember();

  MemberAccount selectMember(long serialNum);

  List<MemberAccount> findAllMember();

  MemberAccount updateMember();

  MemberAccount deleteMemeber();

}
