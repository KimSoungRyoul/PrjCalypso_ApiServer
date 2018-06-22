package org.givenness.backend.domain.member;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@DiscriminatorValue("profile")
@EqualsAndHashCode(callSuper = false)
public class ProfileImage extends FileInfo {

  @OneToOne(mappedBy = "profileImage")
  protected MemberAccount imageOwner;

}
