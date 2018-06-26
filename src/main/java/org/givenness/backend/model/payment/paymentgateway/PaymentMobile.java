package org.givenness.backend.model.payment.paymentgateway;


import org.givenness.backend.model.payment.Payment;
import org.givenness.backend.model.payment.valueobj.PhoneCarrier;


public class PaymentMobile extends Payment {

  private String phoneNum;

  private String PayerName;

  //통신사
  private PhoneCarrier phoneCarrier;


}
