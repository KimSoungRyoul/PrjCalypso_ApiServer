package org.givenness.backend.domain.payment.paymentgateway;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.givenness.backend.domain.payment.Payment;
import org.givenness.backend.domain.payment.valueobj.PhoneCarrier;

@Entity
@DiscriminatorValue("mobile")
public class PaymentMobile extends Payment {

  private String phoneNum;

  private String PayerName;

  //통신사
  private PhoneCarrier phoneCarrier;


}
