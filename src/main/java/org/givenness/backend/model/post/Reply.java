package org.givenness.backend.model.post;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
public class Reply {


  private long serialNum;


  private long replyOwnedPostId;


  @JsonBackReference
  private long parentReplyId;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  //작성자의 이름
  private String writerName;

  //외래키 연결
  private long replyOwner;

  //답글의 답글
  private List<Reply> replies;


}
