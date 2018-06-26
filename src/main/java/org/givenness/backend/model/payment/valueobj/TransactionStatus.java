package org.givenness.backend.model.payment.valueobj;

public enum TransactionStatus {
  SUCCESS,
  // 입력정보 안맞음
  FAIL_400,
  // 결제사 점검중
  FAIL_500,
  // 환불
  REFUNDED
}
