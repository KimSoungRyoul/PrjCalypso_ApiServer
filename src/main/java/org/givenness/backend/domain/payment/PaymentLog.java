package org.givenness.backend.domain.payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.payment.valueobj.TransactionStatus;


@Entity
@Data
public class PaymentLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long serialNum;

  @ManyToOne
  @JoinColumn(name = "payment_order_id")
  private Payment payment;

  @Enumerated(EnumType.STRING)
  private TransactionStatus transactionStatus;


  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  private Date regDate;

  private int price;


}
