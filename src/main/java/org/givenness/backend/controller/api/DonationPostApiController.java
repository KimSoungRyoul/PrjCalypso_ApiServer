package org.givenness.backend.controller.api;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donation/posts")
public class DonationPostApiController {

  @ApiOperation(value = "봉사활동 게시물 리스트 조회")
  @GetMapping(name = "asdf",value = "/{postType}")
  public String getPostList(@RequestParam("pageNum") int pageNum,@PathVariable String postType){

    return null;
  }

  @ApiOperation(value = "봉사활동 게시물 1개 조회")
  @GetMapping(name = "asdf",value = "/{postType}/{postSerialNum}")
  public String getPostOne(@RequestParam("pageNum") int pageNum,@PathVariable String postType,@PathVariable long postSerialNum){

    return null;
  }



}

