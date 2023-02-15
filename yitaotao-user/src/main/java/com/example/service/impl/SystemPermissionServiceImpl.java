package com.example.service.impl;

import com.example.service.SystemPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能权限应用服务默认实现
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SystemPermissionServiceImpl implements SystemPermissionService {


}
