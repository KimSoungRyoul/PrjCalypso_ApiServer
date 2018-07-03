package org.givenness.backend.presentation.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.payment.valueobj.PhoneCarrier;

@Data
@EqualsAndHashCode
@ApiModel(value = "paymentDTO", description = "결재 내역 정보")
public class PaymentDTO {

  protected long orderId;

  protected long transactionId;

  protected String paymentOwner;


  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  protected Date paidDate;
  protected int price;
  protected String description;


  //bank
  private String bankName;
  private String bandCardIdentifiedNum;


  //kakaoPay
  private String kakaoPayInterlockedAccount;
  private String kakaoPayOtherInfo1;
  private String kakaoPayOtherInfo2;


  //mobile
  private String phoneNum;
  private String PayerName;
  private PhoneCarrier phoneCarrier;

  //naverPay
  private String interlockedAccount;
  private String naverPayOtherInfo1;
  private String naverPayOtherInfo2;


}
