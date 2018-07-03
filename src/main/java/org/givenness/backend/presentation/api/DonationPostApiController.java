package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import org.givenness.backend.model.post.DonationPost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@Api(description = "게시판 관련 API")
public class DonationPostApiController {

  @ApiOperation(value = "봉사활동 게시물 리스트 조회")
  @ApiImplicitParams({@ApiImplicitParam(name = "pageNum", value = "페이지 번호// 페이지 단위로 10개씩 끊어서 준다 ")})
  @GetMapping(name = "asdf", value = "/{postType}")
  public String getPostList(@RequestParam("pageNum") int pageNum, @PathVariable String postType) {

    return null;
  }

  @ApiOperation(value = "봉사활동 게시물 1개 조회")
  @GetMapping(value = "/{postSerialNum}")
  public String getPostOne(@RequestParam("pageNum") int pageNum, @PathVariable long postSerialNum) {

    return null;
  }

  @ApiOperation(value = "봉사활동 게시물 등록")
  @PostMapping
  public ResponseEntity postDonationPost(
      @ApiParam(name = "게시물", value = "게시판등록을 위한 정보들", example = "없음") @RequestBody DonationPost donationPost) {

    return new ResponseEntity(HttpStatus.CREATED);
  }

  @ApiOperation(value = "게시물 수정", produces = "application/json")
  @PutMapping("/{postSerialNum}")
  public ResponseEntity putDonationPost(
      @PathVariable long postSerialNum,
      @ApiParam(
          name = "게시물",
          value = "게시물 수정된 정보를 넣는다 serialNum은 경로에서 받기때문에 여기에는 뭘넣어도 무시됨",
          required = true,
          examples = @Example({@ExampleProperty("{\n}")})
      )
      @RequestBody
          DonationPost donationPost) {

    return new ResponseEntity(HttpStatus.OK);
  }
}
