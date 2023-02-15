package com.example.controller;

import com.example.dto.YiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.service.YiUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class YiUserController {

    @Autowired
    private YiUserService yiUserService;

    /**
     * 添加用户
     */
    @RequestMapping("/user/add")
    @ResponseBody
    public YiUser addUser(YiUser user){
        YiUser yiUser = new YiUser();
        yiUser.setLoginName("zhangzijun");
        yiUser.setPassword("1111111");
        yiUser.setUserName("张自军");
        yiUserService.addUser(yiUser);
        return user;
    }
}
