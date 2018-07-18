package org.givenness.backend.application;

import java.util.List;
import org.givenness.backend.model.post.DonationPost;
import org.springframework.stereotype.Service;

@Service
public class DonationPostServiceImpl implements DonationPostService {

  @Override
  public List<DonationPost> readPostList(int pageNum) {
    return null;
  }

  @Override
  public DonationPost readPostOne(long postSerailNum) {
    return null;
  }

  @Override
  public void registerPost(DonationPost post) {

  }

  @Override
  public void modifyPost(DonationPost post) {

  }

  @Override
  public void deletePost(long postSerialNum) {

  }
}
