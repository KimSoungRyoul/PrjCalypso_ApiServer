package com.prj.calypso_apiserver.domain.post;

import com.prj.calypso_apiserver.domain.member.TheMarginalizedAdminMember;
import java.util.Date;
import java.util.List;


public class DonationPost {

  List<Reply> replyList;
  private long serialNum;
  private Date regDate;
  //게시물 등록자
  private TheMarginalizedAdminMember postOwner;
  //봉사 마감 기한
  private Date donatingDeadlineDate;
  private String title;
  private String storyContents;


}
