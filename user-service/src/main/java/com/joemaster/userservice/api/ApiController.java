package com.joemaster.userservice.api;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by pengzq on 2020/7/12
 */
@Slf4j
@RestController
@Api(tags = "用户模块接口")
@RequestMapping("/api")
public class ApiController {
}
