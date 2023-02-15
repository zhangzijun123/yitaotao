package com.example.mapper;


import com.example.dto.YiUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * 用户表Mapper
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@Mapper
public interface YiUserMapper extends BaseMapper<YiUser> {


}
