package com.joemaster.logservice.rabbit;

import com.alibaba.fastjson.JSON;
import com.joemaster.logservice.entity.SysLog;
import com.joemaster.logservice.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Create by pengzq on 2020-7-15
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private SysLogService sysLogService;

    public void receiveMessage(String message){
        System.out.println("Received <" + message + ">");
        SysLog sysLog=  JSON.parseObject(message,SysLog.class);
        sysLogService.saveLoggers(sysLog);
        latch.countDown();
    }
}
