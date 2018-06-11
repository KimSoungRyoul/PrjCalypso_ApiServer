package com.prj.calypso_apiserver.controller.api;

import com.prj.calypso_apiserver.controller.api.baseUrl.VolunteerBasedURL;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "자원봉사 기록 API")
public class VolunteerLogApiController implements VolunteerBasedURL {

  @ApiOperation(value = "자원봉사기록들 회원봉사기록,공공기관의봉사행사 주최기록 둘다")
  @GetMapping("/log/{memberId}")
  public String getVolunteerLog(@PathVariable String memberId,@RequestParam("mType")String mType) {

    return null;

  }



}
