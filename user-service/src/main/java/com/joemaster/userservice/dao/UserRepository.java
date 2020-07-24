package com.joemaster.userservice.dao;

import com.joemaster.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by pengzq on 2020-7-13
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByUserName(String username);
}
