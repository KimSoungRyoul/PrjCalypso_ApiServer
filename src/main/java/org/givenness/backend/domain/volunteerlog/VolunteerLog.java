package org.givenness.backend.domain.volunteerlog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.domain.member.MemberAccount;
import org.givenness.backend.domain.post.DonationPost;


@Data
public class VolunteerLog {


  private long serialNum;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date startDate;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date endDate;

  private String description;


  private MemberAccount joinedMember;


  private DonationPost donationPost;

}
