package com.joemaster.logservice.service;

import com.joemaster.logservice.entity.SysLog;
import com.joemaster.logservice.repository.SysLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by pengzq on 2020-7-15
 */
@Service
public class SysLogService {

    @Autowired
    private SysLogRepository sysLogRepository;

    public void saveLoggers(SysLog sysLog){
        sysLogRepository.save(sysLog);
    }
}
