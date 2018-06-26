package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/volunteer")
@Api(description = "자원봉사관련 API")
public class VolunteerApiController {


  @GetMapping("/log/{memberId}")
  public String getVolunteerLog(@PathVariable String memberId) {

    return null;

  }

}
