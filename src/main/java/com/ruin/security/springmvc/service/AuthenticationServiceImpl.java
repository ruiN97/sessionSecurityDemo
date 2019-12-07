package com.ruin.security.springmvc.service;

import com.ruin.security.springmvc.model.AuthenticationRequest;
import com.ruin.security.springmvc.model.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ruin
 * @date 2019/12/7-15:33
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService{
    /**
     * 用户认证 校验用户身份信息
     * @param authenticationRequest
     * @return
     */
    @Override
    public UserDto authentication(AuthenticationRequest authenticationRequest) {
//        校验参数是否为空
        if(authenticationRequest==null||
                StringUtils.isEmpty(authenticationRequest.getUsername())||
                StringUtils.isEmpty(authenticationRequest.getPassword())){
            throw new RuntimeException("账号密码为空");
        }
//        根据账号查询数据库
        UserDto user=getUserDto(authenticationRequest.getUsername());
        if(user==null){
            throw new RuntimeException("用户不存在");
        }
//       校验密码
        if(!authenticationRequest.getPassword().equals(user.getPassword())){
            throw new RuntimeException("账号或密码错误");
        }
//        认证通过
        return user;
    }

//    根据账号查询用户信息
    private UserDto getUserDto(String userName){
        return userMap.get(userName);
    }

    private Map<String,UserDto> userMap=new HashMap<>();
    {
        Set<String> authorities1=new HashSet<>();
        authorities1.add("p1");
        Set<String> authorities2=new HashSet<>();
        authorities2.add("p2");
        userMap.put("zhangsan",new UserDto("1010","zhangsan","123","张三","123456",authorities1));
        userMap.put("lisi",new UserDto("1011","lisi","456","李四","231232",authorities2));
    }
}
