package com.example.service.impl;

import org.springframework.stereotype.Service;
import com.example.service.SystemRoleService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统角色表应用服务默认实现
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SystemRoleServiceImpl implements SystemRoleService {

}
