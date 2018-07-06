package org.givenness.backend.infrastructure;


import org.givenness.backend.infrastructure.mapper.DonationPostMapper;
import org.givenness.backend.model.post.DonationPost;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev")
public class DonationPostMapperTest extends DefaultAbstractTest {

  @Autowired
  private DonationPostMapper donationPostMapper;


  @Test
  public void selectOnePost() {

    DonationPost donationPost = donationPostMapper.selectOnePost(1L);


  }


}
