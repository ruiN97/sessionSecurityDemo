package com.ruin.security.springmvc.controller;

import com.ruin.security.springmvc.model.AuthenticationRequest;
import com.ruin.security.springmvc.model.UserDto;
import com.ruin.security.springmvc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author ruin
 * @date 2019/12/7-15:55
 */
@RestController
public class LoginController {

    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value = "/login",produces = {"text/plain;charset=UTF-8"})
    public String login(AuthenticationRequest authenticationRequest, HttpSession session){
        UserDto userDto=authenticationService.authentication(authenticationRequest);
        session.setAttribute(UserDto.SESSION_USER_KEY,userDto);
        return userDto.getUsername()+"登陆成功";
    }

    @GetMapping(value = "/logout",produces = {"text/plain;charset=UTF-8"})
    public String logout(HttpSession session){
        session.invalidate();
        return "退出成功";
    }
    @GetMapping(value = "/r/r1",produces = {"text/plain;charset=UTF-8"})
    public String r1(HttpSession session){
        String fullName=null;
        Object object=session.getAttribute(UserDto.SESSION_USER_KEY);
        if(object==null){
            fullName="匿名";
        }else{
            UserDto userDto=(UserDto) object;
            fullName=userDto.getFullName();
        }
        return fullName+"访问资源r1";
    }

    @GetMapping(value = "/r/r2",produces = {"text/plain;charset=UTF-8"})
    public String r2(HttpSession session){
        String fullName=null;
        Object object=session.getAttribute(UserDto.SESSION_USER_KEY);
        if(object==null){
            fullName="匿名";
        }else{
            UserDto userDto=(UserDto) object;
            fullName=userDto.getFullName();
        }
        return fullName+"访问资源r2";
    }
}
