package org.givenness.backend.domain.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.member.TheMarginalizedAdminMember;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class DonationPost {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;

  @Temporal(TemporalType.TIMESTAMP)
  @CreationTimestamp
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  //게시물 등록자
  @ManyToOne
  @JoinColumn(name = "post_owner_id")
  private TheMarginalizedAdminMember postOwner;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date volunteerStartDate;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date volunteerEndDate;

  //봉사 위치
  private String address;


  //봉사 모집 마감 기한
  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date donatingDeadlineDate;

  private String title;

  @Lob
  private String storyContents;

  @OneToMany(mappedBy = "donationPost")
  private List<PostAttachment> attachments;


}
