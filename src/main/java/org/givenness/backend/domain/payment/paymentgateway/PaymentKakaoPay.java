package org.givenness.backend.domain.payment.paymentgateway;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.givenness.backend.domain.payment.Payment;

@Entity
@DiscriminatorValue("kakao")
public class PaymentKakaoPay extends Payment {

  private String interlockedKakaoAccount;

  private String otherInfo1;
  private String otherInfo2;
}
