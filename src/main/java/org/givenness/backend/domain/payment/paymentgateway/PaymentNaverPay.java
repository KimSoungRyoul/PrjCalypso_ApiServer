package org.givenness.backend.domain.payment.paymentgateway;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.givenness.backend.domain.payment.Payment;

@Entity
@DiscriminatorValue("naver")
public class PaymentNaverPay extends Payment {

  private String interlockedNaverAccount;

  private String otherInfo1;
  private String otherInfo2;

}
