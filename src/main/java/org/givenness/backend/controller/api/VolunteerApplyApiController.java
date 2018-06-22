package org.givenness.backend.controller.api;


import org.givenness.backend.controller.api.baseUrl.VolunteerBasedURL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteerApplyApiController implements VolunteerBasedURL {

  @GetMapping("/apply")
  public String getApplyVolunteer(){

    return null;
  }


}
