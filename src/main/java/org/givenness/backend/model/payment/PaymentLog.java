package org.givenness.backend.model.payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import lombok.Data;
import org.givenness.backend.model.payment.valueobj.TransactionStatus;


@Data
public class PaymentLog {


  private long serialNum;


  private Payment payment;


  private TransactionStatus transactionStatus;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  private int price;


}
