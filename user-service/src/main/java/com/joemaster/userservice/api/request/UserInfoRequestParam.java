package com.joemaster.userservice.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Create by pengzq on 2020-7-17
 */
@Data
public class UserInfoRequestParam {

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(notes = "用户名",required = true)
    @JsonProperty("user_name")
    private String username;
}
