package com.ruin.security.springmvc.service;

import com.ruin.security.springmvc.model.AuthenticationRequest;
import com.ruin.security.springmvc.model.UserDto;

/**
 * @author ruin
 * @date 2019/12/7-15:28
 * @authenticationRequest 用户认证请求 账号和密码
 */
public interface AuthenticationService {
    UserDto authentication(AuthenticationRequest authenticationRequest);
}
