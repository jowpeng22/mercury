package com.joemaster.blogservice.client.hystrix;

import com.joemaster.blogservice.client.UserServiceClient;
import com.joemaster.blogservice.dto.RespDTO;
import com.joemaster.blogservice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by pengzq on 2020-7-14
 */
@Component
@Slf4j
public class UserServiceHystrix implements UserServiceClient{
    @Override
    public RespDTO<User> getUser(String token, String username) {
        log.info("{},{}",token,username);
        return null;
    }
}
