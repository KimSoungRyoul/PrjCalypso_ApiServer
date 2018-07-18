package org.givenness.backend.application;

import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.TheMarginalizedAdminMemberInfo;
import org.givenness.backend.model.member.VolunteerMemberInfo;

public interface MemberInfoService {

  void registerVol(MemberAccount memberAccount, VolunteerMemberInfo memberInfo);

  void registerMAdmin(MemberAccount memberAccount, TheMarginalizedAdminMemberInfo memberInfo);


  VolunteerMemberInfo readVolInfo(String memberId);

  TheMarginalizedAdminMemberInfo readMAdminInfo(String memberId);


  void modifiyAccountInfo(MemberAccount accountInfo);

  void modifiyVolInfo(VolunteerMemberInfo memberInfo);

  void modifyMAdminInfo(TheMarginalizedAdminMemberInfo memberInfo);


  void withdrawal(String memberId);


}
