package org.givenness.backend.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.givenness.backend.model.post.DonationPost;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DonationPostMapper {

    //게시글 작성
    void insertPost(DonationPost post);

    //게시글 전체 조회
    List<DonationPost> selectAllPost();

    //게시글 선택 조회
    void selectPost(long serialNum);

    //게시글 수정
    void updatePost(DonationPost post);

    //게시글 삭제
    void deletePost(long serialNum);

    /*
     * 게시글 개수
     * - 프론트 단에서 React로 게시글들을 무한 스크롤로 구현 시 게시글 개수 파악용
     * - 구체적인 사용은 미정
     */
    //int countPost();
    //TODO: 무한 스크롤, UI 등 종화랑 애기해서 백에서 필요한거 만들기
}
