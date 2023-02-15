package com.example.service.impl;

import org.springframework.stereotype.Service;
import com.example.service.SystemUserRoleService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统用户角色关联表应用服务默认实现
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SystemUserRoleServiceImpl implements SystemUserRoleService {

}
