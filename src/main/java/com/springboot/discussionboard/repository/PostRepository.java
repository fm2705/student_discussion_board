package com.springboot.discussionboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.discussionboard.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

}
