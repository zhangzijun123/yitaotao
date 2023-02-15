package com.example.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dto.YiUser;

/**
 * 用户表应用服务
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
public interface YiUserService{

    /**
     * 添加用户
     */
    YiUser addUser(YiUser user);

}
