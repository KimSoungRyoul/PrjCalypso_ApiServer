package org.givenness.backend.infrastructure;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;
import lombok.extern.log4j.Log4j;
import org.givenness.backend.infrastructure.mapper.DonationPostMapper;
import org.givenness.backend.model.dto.Pageable;
import org.givenness.backend.model.post.DonationPost;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j
public class DonationPostMapperTest extends DefaultAbstractTest {

  @Autowired
  private DonationPostMapper donationPostMapper;

  @Test
  public void insertPost() {

    DonationPost post = new DonationPost();
    post.setPostOwnerName("김성렬");
    post.setTitle("봉사하실분 구합니다.");
    post.setAddress("봉사 장소 주소 문자열...");
    post.setDonatingDeadlineDate(new Date());
    post.setRegDate(new Date());
    post.setStoryContents("봉사 어디서 할꺼고 이 봉사활동은 영국에서 최초로 시작되었며....");
    post.setVolunteerEndDate(new Date());
    post.setVolunteerStartDate(new Date());

    donationPostMapper.insertPost(post);

    List<DonationPost> foundPosts = donationPostMapper.selectPostList(
        new Pageable(1, "봉사하실분"));

    assertNotNull(
        foundPosts.stream()
            .filter(foundPost -> ("김성렬".equals(foundPost.getPostOwnerName())))
            .findFirst().get()
    );


  }

  @Test
  public void selectOnePost() {

    DonationPost donationPost = donationPostMapper.selectOnePost(1L);

    log.info(donationPost.toString());

    assertNotNull(donationPost);
  }

  @Test
  public void selectPostList() {

    List<DonationPost> posts = donationPostMapper.selectPostList(new Pageable(1));

    log.info(posts.toString());
    assertNotNull(posts);
  }
}
