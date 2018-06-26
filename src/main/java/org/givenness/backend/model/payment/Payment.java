package org.givenness.backend.model.payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.model.member.MemberAccount;


@Data
public abstract class Payment {


  protected long orderId;


  protected long transactionId;


  protected MemberAccount paymentOwner;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  protected Date paidDate;

  protected int price;

  protected String description;
}
