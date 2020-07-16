package com.joemaster.logservice.repository;

import com.joemaster.logservice.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by pengzq on 2020-7-15
 */
@Repository
public interface SysLogRepository extends JpaRepository<SysLog,Long>{
}
