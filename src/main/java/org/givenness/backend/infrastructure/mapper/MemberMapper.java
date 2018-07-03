package org.givenness.backend.infrastructure.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.givenness.backend.model.member.MemberAccount;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {

  MemberAccount selectMember(String memberId);

}
