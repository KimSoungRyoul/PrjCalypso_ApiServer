package org.givenness.backend.model.post;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.givenness.backend.model.member.MemberAccount;


@Data
public class Reply {


  private long serialNum;


  private DonationPost replyOwnedPostId;


  @JsonBackReference
  private Reply parentReply;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  //작성자의 이름
  private String writerName;

  //외래키 연결
  @JsonIgnore
  private MemberAccount replyOwner;

  //답글의 답글
  private List<Reply> replies;


}
