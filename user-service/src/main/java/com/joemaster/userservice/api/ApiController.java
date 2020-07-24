package com.joemaster.userservice.api;

import com.joemaster.common.annotation.SysLogger;
import com.joemaster.common.dto.RespDTO;
import com.joemaster.common.exception.CommonException;
import com.joemaster.common.exception.ErrorCode;
import com.joemaster.common.util.HttpConstant;
import com.joemaster.userservice.api.request.UserCreatedRequestParam;
import com.joemaster.userservice.api.request.UserInfoRequestParam;
import com.joemaster.userservice.entity.User;
import com.joemaster.userservice.service.UserService;
import com.joemaster.userservice.util.BPwdEncoderUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Date;

/**
 * Create by pengzq on 2020/7/12
 */
@Slf4j
@RestController
@Api(tags = "用户模块接口")
@RequestMapping("/api")
public class ApiController {

    private final UserService userService;

    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "用户注册", notes = "username和password为必选项")
    @ApiImplicitParam(name = "param",value = "用户实体",required = true,dataType = "UserCreatedRequestParam")
    @PostMapping("/user/registry")
    @SysLogger("registry")
    public RespDTO createUser(@RequestBody @Valid UserCreatedRequestParam param){

        User userInfo = userService.getUserInfo(param.getUsername());
        if(userInfo != null){
            throw new CommonException(ErrorCode.USER_REGISTERED);
        }
        User user = new User();
        user.setUserName(param.getUsername());
        user.setPassword(BPwdEncoderUtils.BCryptPassword(param.getPassword()));
        user.setCreateDate(new Date());
        user.setUpdateAt(new Date());
        userService.createUser(user);
        return RespDTO.result(HttpConstant.OK);
    }

    @ApiOperation(value = "查询用户信息", notes = "username为必选项")
    @ApiImplicitParam(name = "param",value = "用户实体",required = true,dataType = "UserInfoRequestParam")
    @PostMapping("/user/info")
    @SysLogger("user_info")
    public RespDTO getUser(@RequestBody @Valid UserInfoRequestParam param){
        User userInfo = userService.getUserInfo(param.getUsername());
        if(null == userInfo){
            throw new CommonException(ErrorCode.USER_NOT_FOUND);
        }
        return RespDTO.onSuc(userInfo);
    }
}
