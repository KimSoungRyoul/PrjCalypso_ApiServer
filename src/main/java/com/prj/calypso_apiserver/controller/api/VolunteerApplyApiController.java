package com.prj.calypso_apiserver.controller.api;


import com.prj.calypso_apiserver.controller.api.baseUrl.VolunteerBasedURL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteerApplyApiController implements VolunteerBasedURL {

  @GetMapping("/apply")
  public String getApplyVolunteer(){

    return null;
  }


}
