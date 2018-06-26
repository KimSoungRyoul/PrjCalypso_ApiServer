package org.givenness.backend.model.member;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class ProfileImage extends FileInfo {


  protected MemberAccount imageOwner;

}
