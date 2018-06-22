package org.givenness.backend.domain.post;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.givenness.backend.domain.member.FileInfo;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("attachment")
public class PostAttachment extends FileInfo {

  @ManyToOne
  @JoinColumn(name = "post_serial_num")
  protected DonationPost donationPost;


}
