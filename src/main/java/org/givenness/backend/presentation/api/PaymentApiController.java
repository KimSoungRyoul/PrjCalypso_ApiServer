package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.ArrayList;
import java.util.List;
import org.givenness.backend.model.payment.PaymentLog;
import org.givenness.backend.presentation.dto.PaymentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@Api(value = "결제 관련 API", description = "pg쪽 요청승인이후 이루어지는  마일리지또는 기부 기록과 같은 비지니스 로직을 수행")
public class PaymentApiController {

  @ApiOperation(value = "회원의 결제내역 조회", produces = "application/json")
  @GetMapping("/{memberId}")
  public ResponseEntity<List<PaymentLog>> getPaymentLog(
      @ApiParam(name = "조회하고자하는 회원의 아이디") @PathVariable String memberId) {

    return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
  }

  @ApiOperation(value = "회원의 결제기록 생성 결제,환불,실패 기록 전부")
  @PostMapping("/{paymentGateway}")
  public ResponseEntity postPayment(
      @PathVariable String paymentGateway, @RequestBody PaymentDTO paymentDTO) {

    return new ResponseEntity(HttpStatus.CREATED);
  }
}
