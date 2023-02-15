package com.example.service.impl;

import com.example.service.SystemRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统角色权限关联表应用服务默认实现
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SystemRolePermissionServiceImpl implements SystemRolePermissionService {
    @Autowired
    private RedisTemplate redisTemplate;


}
