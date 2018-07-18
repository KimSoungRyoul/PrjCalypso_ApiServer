package org.givenness.backend.application;

import java.util.List;
import org.givenness.backend.model.post.DonationPost;

public interface DonationPostService {

  List<DonationPost> readPostList(int pageNum);

  DonationPost readPostOne(long postSerailNum);

  void registerPost(DonationPost post);

  void modifyPost(DonationPost post);

  void deletePost(long postSerialNum);
}
