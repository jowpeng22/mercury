package com.joemaster.blogservice.client;

import com.joemaster.blogservice.client.hystrix.UserServiceHystrix;
import com.joemaster.blogservice.entity.User;
import com.joemaster.common.dto.RespDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Create by pengzq on 2020-7-14
 */
@FeignClient(value = "user-service",fallback = UserServiceHystrix.class)
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
}
