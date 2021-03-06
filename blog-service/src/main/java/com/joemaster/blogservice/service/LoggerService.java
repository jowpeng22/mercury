package com.joemaster.blogservice.service;

import com.alibaba.fastjson.JSON;
import com.joemaster.blogservice.cfg.RabbitConfig;
import com.joemaster.blogservice.entity.SysLog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by pengzq on 2020-7-16
 */
@Service
public class LoggerService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void log(SysLog sysLog){
        rabbitTemplate.convertAndSend(RabbitConfig.queueName, JSON.toJSONString(sysLog));
    }
}
