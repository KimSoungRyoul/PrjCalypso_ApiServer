package org.givenness.backend.model.post;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.model.member.FileInfo;


@Data
@EqualsAndHashCode(callSuper = false)

public class PostAttachment extends FileInfo {


  protected DonationPost donationPost;


}
