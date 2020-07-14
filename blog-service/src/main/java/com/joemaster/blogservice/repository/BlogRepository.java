package com.joemaster.blogservice.repository;

import com.joemaster.blogservice.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by pengzq on 2020-7-14
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog,Long>{

    List<Blog> findByUsername(String username);
}
