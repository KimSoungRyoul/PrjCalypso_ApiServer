package org.givenness.backend.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.givenness.backend.application.MemberInfoService;
import org.givenness.backend.model.member.MemberAccount;
import org.givenness.backend.model.member.MemberAuthority;
import org.givenness.backend.model.member.ProfileImage;
import org.givenness.backend.model.member.TheMarginalizedAdminMemberInfo;
import org.givenness.backend.model.member.VolunteerMemberInfo;
import org.givenness.backend.model.member.valueobj.AuthorityType;
import org.givenness.backend.model.member.valueobj.VolunteerType;
import org.givenness.backend.presentation.dto.MAdminMemberDTO;
import org.givenness.backend.presentation.dto.VolunteerMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@Api(description = "회원정보 API")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MemberApiController {

  private MemberInfoService memberInfoService;

  /* -------------조회 API----------------------- */
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
      params = {"mType=vol"}
  )
  public ResponseEntity<VolunteerMemberInfo> getVolunteerMemberInfo(
      @PathVariable("memberId") String memberId) {

    ResponseEntity<VolunteerMemberInfo> entity = null;

    try {

      VolunteerMemberInfo volInfo = memberInfoService.readVolInfo(memberId);

      entity = new ResponseEntity<>(volInfo, HttpStatus.OK);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
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
  public ResponseEntity<TheMarginalizedAdminMemberInfo> getMAdminMemberInfo(
      @PathVariable("memberId") String memberId) {

    ResponseEntity<TheMarginalizedAdminMemberInfo> entity = null;

    try {

      TheMarginalizedAdminMemberInfo adminMemberInfo = memberInfoService.readMAdminInfo(memberId);

      entity = new ResponseEntity<>(adminMemberInfo, HttpStatus.OK);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
  }
  /* ------------- 조회 API  End----------------------- */

  /* ------------------------수정 API----------------------- */

  @ApiOperation(value = "회원정보 수정", produces = "application/json")
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "mType",
          value = "수정될 정보의 타입을 입력합니다 타입에 맞는 body정보 \"한개!!\"만 보내야함",
          allowableValues = "vol,admin,auth",
          paramType = "query",
          required = true,
          dataType = "string"
      )
  })
  @PutMapping(
      value = "/{memberId}",
      params = {"mType=auth"}
  )
  public ResponseEntity putMemberAuthInfo(
      @PathVariable String memberId,
      @ApiParam(
          name = "회원가입 개인정보",
          value = "mType이 auth,vol,admin 3개에 따라서 json포맷이 달라진다 자세한거는 담당자 김성렬 010-7237-6602에 문의",
          defaultValue = "memberAccount"
      )
      @RequestBody
          MemberAccount memberAccount) {

    ResponseEntity<VolunteerMemberInfo> entity = null;

    try {

      memberInfoService.modifiyAccountInfo(memberAccount);

      entity = new ResponseEntity<>(HttpStatus.CREATED);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
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
      )
  })
  @PutMapping(
      value = "/{memberId}",
      params = {"mType=vol"}
  )
  public ResponseEntity putMemberVolInfo(
      @PathVariable String memberId,
      @ApiParam(
          name = "회원가입 개인정보",
          value = "mType이 auth,vol,admin 3개에 따라서 json포맷이 달라진다 자세한거는 담당자 010-7237-6602에 문의",
          defaultValue = "memberAccount"
      )
      @RequestBody
          VolunteerMemberInfo volunteerMemberInfo) {

    ResponseEntity<VolunteerMemberInfo> entity = null;

    try {

      memberInfoService.modifiyVolInfo(volunteerMemberInfo);

      entity = new ResponseEntity<>(HttpStatus.CREATED);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
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
      )
  })
  @PutMapping(
      value = "/{memberId}",
      params = {"mType=admin"}
  )
  public ResponseEntity putMemberAdminInfo(
      @PathVariable String memberId,
      @ApiParam(
          name = "회원가입 개인정보",
          value = "mType이 auth,vol,admin 3개에 따라서 json포맷이 달라진다 자세한거는 담당자 010-7237-6602에 문의",
          defaultValue = "memberAccount"
      )
      @RequestBody
          TheMarginalizedAdminMemberInfo adminMemberInfo) {

    ResponseEntity<VolunteerMemberInfo> entity = null;

    try {

      memberInfoService.modifyMAdminInfo(adminMemberInfo);

      entity = new ResponseEntity<>(HttpStatus.CREATED);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
  }
  /* ------------------------수정 API End----------------------- */

  /* ------------------------회원가입 API ----------------------- */
  @ApiOperation(value = "회원 가입 ", produces = "application/json")
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "mType",
          value = "가입할 회원 타입을 입력합니다 타입에 맞는 body정보 \"한개!!\"만 보내야함",
          allowableValues = "vol,admin",
          paramType = "query",
          required = true,
          dataType = "string"
      )
  })
  @PostMapping(params = {"mType=vol"})
  public ResponseEntity postVolunteerMember(
      @ApiParam(
          name = "회원가입 개인정보",
          value = "mType이 vol,admin 2개 수정API와 body포맷이 같다.",
          defaultValue = "volunteerMember"
      )
      @RequestBody
          VolunteerMemberDTO volDTO) {

    ResponseEntity<VolunteerMemberInfo> entity = null;

    try {

      MemberAuthority authority = new MemberAuthority();
      authority.setGrantedDate(new Date());
      authority.setAuthorityType(AuthorityType.VOLUNTEER_PERSONAL);

      Set<MemberAuthority> authorities = new HashSet<>(Arrays.asList(authority));

      MemberAccount memberAccount = new MemberAccount();
      memberAccount.setMemberId(volDTO.getMemberId());
      memberAccount.setPassword(volDTO.getPassword());
      memberAccount.setPasswordHint(volDTO.getPasswordHint());
      memberAccount.setPasswordHintAnswer(volDTO.getPasswordHintAnswer());
      memberAccount.setGrantedAuthList(authorities);
      memberAccount.setProfileImage(new ProfileImage(volDTO.getProfileImageSerialNum()));

      VolunteerMemberInfo volunteerMemberInfo = new VolunteerMemberInfo();
      volunteerMemberInfo.setEmail(volDTO.getEmail());
      volunteerMemberInfo.setAddress(volDTO.getAddress());
      volunteerMemberInfo.setName(volDTO.getName());
      volunteerMemberInfo.setPersonalOrOrganization(VolunteerType.PERSONAL);
      volunteerMemberInfo.setPhoneNum(volDTO.getPhoneNum());

      memberInfoService.registerVol(memberAccount, volunteerMemberInfo);

      entity = new ResponseEntity<>(HttpStatus.CREATED);

    } catch (Exception e) {

      entity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
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
      )
  })
  @PostMapping(params = {"mType=admin"})
  public ResponseEntity postMAdimMember(
      @ApiParam(
          name = "회원가입 개인정보",
          value = "mType이 vol,admin 2개에 따라서 json포맷이 달라진다 수정API와 body포맷이 같다.",
          defaultValue = "theMarginalizedAdminMember"
      )
      @RequestBody
          MAdminMemberDTO mAdminDTO) {

    MemberAuthority authority = new MemberAuthority();
    authority.setGrantedDate(new Date());
    authority.setAuthorityType(AuthorityType.THEMARGINALIZEDADMIN);

    Set<MemberAuthority> authorities = new HashSet<>(Arrays.asList(authority));

    MemberAccount memberAccount = new MemberAccount();
    memberAccount.setMemberId(mAdminDTO.getMemberId());
    memberAccount.setPassword(mAdminDTO.getPassword());
    memberAccount.setPasswordHint(mAdminDTO.getPasswordHint());
    memberAccount.setPasswordHintAnswer(mAdminDTO.getPasswordHintAnswer());
    memberAccount.setGrantedAuthList(authorities);
    memberAccount.setProfileImage(new ProfileImage(mAdminDTO.getProfileImageSerialNum()));

    TheMarginalizedAdminMemberInfo adminMemberInfo = new TheMarginalizedAdminMemberInfo();
    adminMemberInfo.setEmail(mAdminDTO.getEmail());
    adminMemberInfo.setAddress(mAdminDTO.getAddress());
    adminMemberInfo.setPhoneNum(mAdminDTO.getPhoneNum());
    adminMemberInfo.setAdminDepartmentName(mAdminDTO.getAdminDepartmentName());

    memberInfoService.registerMAdmin(memberAccount, adminMemberInfo);


    return new ResponseEntity(HttpStatus.CREATED);
  }

  /* ------------------------회원가입 API End----------------------- */

  /* ------------------------회원탈퇴 API End----------------------- */
  @ApiOperation(value = "회원 탈퇴 ", produces = "application/json")
  @ApiImplicitParams(@ApiImplicitParam(name = "memberId", value = "삭제하고자하는 회원 이메일 .을 *바꿔서 보내야한다"))
  @DeleteMapping("/{memberId}")
  public ResponseEntity deleteMember(@PathVariable String memberId) {

    ResponseEntity entity = null;

    try {

      entity = new ResponseEntity(HttpStatus.OK);

    } catch (Exception e) {
      entity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    return entity;
  }
}
