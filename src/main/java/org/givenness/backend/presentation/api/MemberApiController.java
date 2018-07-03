package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.TheMarginalizedAdminMember;
import org.givenness.backend.model.member.VolunteerMember;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@Api(description = "회원정보 API")
public class MemberApiController {

  /* -------------조회 API----------------------- */
  @GetMapping(
      value = "/{memberId}",
      params = {"mType=vol"}
  )
  public ResponseEntity<VolunteerMember> getVolunteerMemberInfo(
      @PathVariable("memberId") String memberId) {

    return new ResponseEntity(new VolunteerMember(), HttpStatus.OK);
  }

  @ApiOperation(value = "회원정보 조회", produces = "application/json")
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "memberId",
          value = "회원의 아이디 이메일주소에서 \".\" 은 * 으로 변환해서 입력 (봉사자와 동일)",
          example = "admin@naver.com",
          required = true,
          paramType = "path",
          dataType = "string"
      ),
      @ApiImplicitParam(
          name = "mType",
          value = "회원 타입 admin(소외계층 관리자) 또는 vol(봉사자)",
          example = "admin",
          paramType = "query",
          dataType = "string",
          allowableValues = "vol, admin",
          defaultValue = "vol"
      )
  })
  @GetMapping(
      value = "/{memberId}",
      params = {"mType=admin"}
  )
  public ResponseEntity<TheMarginalizedAdminMember> getMAdminMemberInfo(
      @PathVariable("memberId") String memberId) {

    return new ResponseEntity(new TheMarginalizedAdminMember(), HttpStatus.OK);
  }
  /* ------------- 조회 API  End----------------------- */


  /* ------------------------수정 API----------------------- */
  @PutMapping(
      value = "/{memberId}",
      params = {"mType=auth"}
  )
  public ResponseEntity putMemberAuthInfo(
      @PathVariable String memberId, @RequestBody MemberAccount memberAccount) {

    return new ResponseEntity(HttpStatus.OK);
  }

  @PutMapping(
      value = "/{memberId}",
      params = {"mType=vol"}
  )
  public ResponseEntity putMemberVolInfo(
      @PathVariable String memberId, @RequestBody VolunteerMember volunteerMember) {

    return new ResponseEntity(HttpStatus.OK);
  }

  @ApiOperation(value = "회원정보 수정", produces = "application/json")
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "mType",
          value = "수정될 정보의 타입을 입력합니다 타입에 맞는 body정보 \"한개!!\"만 보내야함",
          allowableValues = "vol,admin,auth",
          paramType = "query",
          required = true,
          dataType = "string"
      ),
      @ApiImplicitParam(
          name = "memberAccount",
          value = "mType=auth 수정할 회원 인증 정보 (3개중 택1)",
          paramType = "body",
          dataType = "memberAccount"
      ),
      @ApiImplicitParam(
          name = "volunteerMember",
          value = "mType=vol 수정할 자원봉사자 회원 정보 (3개중 택1)",
          paramType = "body",
          dataType = "volunteerMember"
      ),
      @ApiImplicitParam(
          name = "theMarginalizedAdminMember",
          value = "mType=admin 수정할 소외계층관리자 회원 정보 (3개중 택1)",
          paramType = "body",
          dataType = "theMarginalizedAdminMember"
      )
  })
  @PutMapping(
      value = "/{memberId}",
      params = {"mType=admin"}
  )
  public ResponseEntity putMemberAdminInfo(
      @PathVariable String memberId,
      @RequestBody TheMarginalizedAdminMember theMarginalizedAdminMember) {

    return new ResponseEntity(HttpStatus.OK);
  }

  /* ------------------------수정 API End----------------------- */


  /* ------------------------회원가입 API ----------------------- */
  @PostMapping(params = {"mType=vol"})
  public ResponseEntity postVolunteerMember(@RequestBody VolunteerMember volunteerMember) {

    return new ResponseEntity(HttpStatus.CREATED);
  }

  @ApiOperation(value = "회원 가입 ", produces = "application/json")
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "mType",
          value = "가입할 회원 타입을 입력합니다 타입에 맞는 body정보 \"한개!!\"만 보내야함",
          allowableValues = "vol,admin",
          paramType = "query",
          required = true,
          dataType = "string"
      ),


  })
  @PostMapping(params = {"mType=admin"})
  public ResponseEntity postMAdimMember(
      @RequestBody TheMarginalizedAdminMember theMarginalizedAdminMember) {

    return new ResponseEntity(HttpStatus.CREATED);
  }

  /* ------------------------회원가입 API End----------------------- */









}
