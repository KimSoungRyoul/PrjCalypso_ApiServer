package org.givenness.backend.domain.payment.paymentgateway;


import org.givenness.backend.domain.payment.Payment;
import org.givenness.backend.domain.payment.valueobj.PhoneCarrier;


public class PaymentMobile extends Payment {

  private String phoneNum;

  private String PayerName;

  //통신사
  private PhoneCarrier phoneCarrier;


}
