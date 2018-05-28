package com.prj.calypso_apiserver.domain.member.valueobj;

import com.prj.calypso_apiserver.domain.member.MemberAccount;
import java.util.Date;

public class MemberAuthority {

  private long serialNum;

  private Date grantedDate;

  private AuthorityType authorityType;

  private MemberAccount authOwner;


}
