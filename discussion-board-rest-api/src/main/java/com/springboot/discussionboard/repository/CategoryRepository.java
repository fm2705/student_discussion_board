package com.springboot.discussionboard.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.discussionboard.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
