package com.joemaster.userservice.cfg;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Create by pengzq on 2020/7/12
 */
@FeignClient(value = "uaa-service")
public class AuthServiceClient {



}
