package org.givenness.backend.domain.post;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.member.MemberAccount;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Data
public class Reply {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;

  @ManyToOne
  @JoinColumn(name = "reply_owned_post_serial_num")
  private DonationPost replyOwnedPostId;

  @ManyToOne
  @JoinColumn(name = "parent_reply_id")
  @JsonBackReference
  private Reply parentReply;


  @Temporal(TemporalType.TIMESTAMP)
  @CreationTimestamp
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  //작성자의 이름
  private String writerName;

  //외래키 연결
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "reply_owner")
  private MemberAccount replyOwner;

  //답글의 답글
  @OneToMany(mappedBy = "parentReply")
  private List<Reply> replies;


}
