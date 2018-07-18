package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.givenness.backend.model.volunteerhistory.VolunteerHistory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/volunteers")
@Api(description = "자원봉사관련 API")
public class VolunteerApiController {

  @ApiOperation(value = "자원 봉사 기록 조회")
  @GetMapping("/history/{memberId}")
  public String getVolunteerLog(@PathVariable String memberId) {

    return null;

  }

  @ApiOperation(value = "자원봉사 기록 등록", produces = "application/json")
  @PostMapping("/history")
  public ResponseEntity postLog(@RequestBody VolunteerHistory volunteerLog) {

    return new ResponseEntity(HttpStatus.CREATED);
  }

}
