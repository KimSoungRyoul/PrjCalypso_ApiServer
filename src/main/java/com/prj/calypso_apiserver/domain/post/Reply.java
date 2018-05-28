package com.prj.calypso_apiserver.domain.post;

import com.prj.calypso_apiserver.domain.member.MemberAccount;
import java.util.Date;
import java.util.List;

public class Reply {

  private long serialNum;


  private Date regDate;

  private MemberAccount replyOwner;

  //답글의 답글
  private List<Reply> replies;

}
