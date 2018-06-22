package org.givenness.backend.domain.volunteerlog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.member.MemberAccount;
import org.givenness.backend.domain.post.DonationPost;

@Entity
@Data
public class VolunteerLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date startDate;


  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date endDate;

  private String description;

  @ManyToOne
  @JoinColumn(name = "joinedMember")
  private MemberAccount joinedMember;

  @ManyToOne
  @JoinColumn(name = "donation_post_serial_num")
  private DonationPost donationPost;

}
