package com.joemaster.userservice.client;

import com.joemaster.userservice.client.hystrix.AuthServiceHystrix;
import com.joemaster.userservice.entity.JWT;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by pengzq on 2020/7/12
 */
@FeignClient(value = "uaa-service",fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {

    @PostMapping(value = "/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("username") String username, @RequestParam("password") String password);

}
