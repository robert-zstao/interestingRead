package com.zstao.api.mapper;

import com.zstao.api.entity.Comment;

import java.util.List;

public interface CommentDao {
    List<Comment> listComments();

    Comment getComment(Integer cid);

    int saveComment(Comment comment);

    int deleteComment(Integer cid);

    int CommentNumber();
}
