package com.prj.calypso_apiserver.controller.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
@Api(description = "회원정보 API")
public class MemberApiController {

  @GetMapping
  public String getMemberInfo(@RequestParam("mtype") String mType) {

    return null;
  }

}
