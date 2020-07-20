package com.joemaster.uaaservice.repository;

import com.joemaster.uaaservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by pengzq on 2020-7-20
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findFirstByUsername(String username);
}
