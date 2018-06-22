package org.givenness.backend.domain.payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.givenness.backend.domain.member.MemberAccount;


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "payment_company")
public abstract class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long orderId;

  @Column(unique = true)
  protected long transactionId;

  @ManyToOne
  @JoinColumn(name = "member_serial_num")
  protected MemberAccount paymentOwner;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  protected Date paidDate;

  protected int price;

  protected String description;
}
