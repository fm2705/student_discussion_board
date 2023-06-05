package com.springboot.discussionboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.discussionboard.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
