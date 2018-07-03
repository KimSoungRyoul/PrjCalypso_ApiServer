package org.givenness.backend.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.givenness.backend.model.post.Reply;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReplyMapper {

    //댓글 작성
    void insertReply(Reply reply);

    //댓글 전체 조회
    List<Reply> selectAllReply();

    //댓글 선택 조회
    void selectReply(long serialNum);

    //댓글 수정
    void updateReply(Reply reply);

    //댓글 삭제
    void deleteReply(long serialNum);
}
