//package com.joemaster.userservice.api;
//
//import com.joemaster.common.annotation.SysLogger;
//import com.joemaster.userservice.entity.User;
//import com.joemaster.userservice.service.UserService;
//import com.joemaster.userservice.util.BPwdEncoderUtils;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Create by pengzq on 2020/7/12
// */
//@Slf4j
//@RestController
//@Api(tags = "用户模块接口")
//@RequestMapping("/api")
//public class ApiController {
//
////    private final UserService userService;
////
////    public ApiController(UserService userService) {
////        this.userService = userService;
////    }
////
////    @ApiOperation(value = "用户注册", notes = "username和password为必选项")
////    @PostMapping("/user/registry")
////    @SysLogger("registry")
////    public User createUser(@RequestBody User user){
////        //参数判读省略,判读该用户在数据库是否已经存在省略
////        String entryPassword= BPwdEncoderUtils.BCryptPassword(user.getPassword());
////        user.setPassword(entryPassword);
////        return userService.createUser(user);
////    }
//}
