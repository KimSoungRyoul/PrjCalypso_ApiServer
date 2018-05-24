package com.prj.calypso_apiserver.domain.member;

import java.util.Date;
import lombok.Data;


@Data
public abstract class MemberAccount {


  protected String memberId;

  protected String password;

  protected Date regDate;


}
