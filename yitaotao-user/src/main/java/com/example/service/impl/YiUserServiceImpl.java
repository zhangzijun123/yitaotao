package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dto.YiUser;
import com.example.mapper.YiUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.YiUserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户表应用服务默认实现
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class YiUserServiceImpl implements YiUserService {

    @Autowired
    private YiUserMapper yiUserMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public YiUser addUser(YiUser user) {
        yiUserMapper.insertSelective(user);
        return user;
    }
}
