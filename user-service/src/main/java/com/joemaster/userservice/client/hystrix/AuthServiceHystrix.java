package com.joemaster.userservice.client.hystrix;

import com.joemaster.userservice.client.AuthServiceClient;
import com.joemaster.userservice.entity.JWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by pengzq on 2020-7-13
 */
@Component
@Slf4j
public class AuthServiceHystrix implements AuthServiceClient{

    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        log.error("username:{} getToken hystrix failed",username);
        return null;
    }
}
