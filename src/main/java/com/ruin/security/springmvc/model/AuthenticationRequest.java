package com.ruin.security.springmvc.model;


import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ruin
 * @date 2019/12/7-15:30
 */
public class AuthenticationRequest {
//    认证请求参数

    private  String username;
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
