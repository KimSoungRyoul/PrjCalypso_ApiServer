package org.givenness.backend.persistence;


import org.apache.ibatis.annotations.Mapper;
import org.givenness.backend.domain.member.MemberAccount;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {

  MemberAccount selectMember(long serialNum);

}
