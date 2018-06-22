package org.givenness.backend.domain.payment.paymentgateway;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.givenness.backend.domain.payment.Payment;

@Entity
@DiscriminatorValue("credit_card")
public class PaymentCreditCard extends Payment {


  private String bankName;

  private String cardIdentifiedNum;

}
