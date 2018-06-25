package org.givenness.backend.domain.post;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.domain.member.FileInfo;


@Data
@EqualsAndHashCode(callSuper = false)

public class PostAttachment extends FileInfo {


  protected DonationPost donationPost;


}
