package com.joemaster.userservice.service;

import com.joemaster.userservice.client.AuthServiceClient;
import com.joemaster.userservice.dao.UserRepository;
import com.joemaster.userservice.dto.LoginDTO;
import com.joemaster.userservice.dto.RespDTO;
import com.joemaster.userservice.entity.JWT;
import com.joemaster.userservice.entity.User;
import com.joemaster.userservice.exception.CommonException;
import com.joemaster.userservice.exception.ErrorCode;
import com.joemaster.userservice.util.BPwdEncoderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by pengzq on 2020-7-13
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthServiceClient authServiceClient;

    public User createUser(User user){
        return  userRepository.save(user);
    }

    public User getUserInfo(String username){
        return userRepository.findFirstByUsername(username);
    }


    public RespDTO login(String username , String password){
        User user = userRepository.findFirstByUsername(username);
        if(null == user){
            throw new CommonException(ErrorCode.USER_NOT_FOUND);
        }
        if(!BPwdEncoderUtils.matches(password,user.getPassword())){
            throw new CommonException(ErrorCode.USER_PASSWORD_ERROR);
        }
        JWT jwt = authServiceClient.getToken("Basic dWFhLXNlcnZpY2U6MTIzNDU2", password, username, password);
        // 获得用户菜单
        if(null==jwt){
            throw new CommonException(ErrorCode.GET_TOKEN_FAIL);
        }
        LoginDTO loginDTO=new LoginDTO();
        loginDTO.setUser(user);
        loginDTO.setToken(jwt.getAccess_token());
        return RespDTO.onSuc(loginDTO);
    }
}
