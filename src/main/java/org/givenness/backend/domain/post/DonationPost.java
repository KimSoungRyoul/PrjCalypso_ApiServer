package org.givenness.backend.domain.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.givenness.backend.domain.member.TheMarginalizedAdminMember;


@Data
public class DonationPost {


  private long serialNum;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  //게시물 등록자

  private TheMarginalizedAdminMember postOwner;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date volunteerStartDate;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date volunteerEndDate;

  //봉사 위치
  private String address;


  //봉사 모집 마감 기한

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date donatingDeadlineDate;

  private String title;


  private String storyContents;


  private List<PostAttachment> attachments;


}
