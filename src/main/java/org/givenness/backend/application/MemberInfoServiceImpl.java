package org.givenness.backend.application;

import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.TheMarginalizedAdminMemberInfo;
import org.givenness.backend.model.member.VolunteerMemberInfo;
import org.springframework.stereotype.Service;


@Service
public class MemberInfoServiceImpl implements MemberInfoService {

  @Override
  public void registerVol(MemberAccount memberAccount, VolunteerMemberInfo memberInfo) {
  }

  @Override
  public void registerMAdmin(
      MemberAccount memberAccount, TheMarginalizedAdminMemberInfo memberInfo) {
  }

  @Override
  public VolunteerMemberInfo readVolInfo(String memberId) {
    return null;
  }

  @Override
  public TheMarginalizedAdminMemberInfo readMAdminInfo(String memberId) {
    return null;
  }

  @Override
  public void modifiyAccountInfo(MemberAccount accountInfo) {
  }

  @Override
  public void modifiyVolInfo(VolunteerMemberInfo memberInfo) {
  }

  @Override
  public void modifyMAdminInfo(TheMarginalizedAdminMemberInfo memberInfo) {
  }

  @Override
  public void withdrawal(String memberId) {
  }
}
