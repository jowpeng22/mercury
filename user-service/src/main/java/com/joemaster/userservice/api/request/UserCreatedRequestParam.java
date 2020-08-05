package com.joemaster.userservice.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Create by pengzq on 2020-7-17
 */
@Data
public class UserCreatedRequestParam {

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(notes = "用户名",required = true)
    @JsonProperty("user_name")
    private String username;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(notes = "密码",required = true,position = 1)
    private String password;

    @ApiModelProperty(notes = "邮箱",position = 4)
    private String email;

    @ApiModelProperty(notes = "手机号",position = 3)
    private String telephone;

    @ApiModelProperty(notes = "昵称",position = 2)
    @JsonProperty("nick_name")
    private String nickName;
}
