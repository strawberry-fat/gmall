package com.ljx.gmall.user.mapper;


import com.ljx.gmall.bean.UmsMember;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;



@RegisterMapper
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UmsMember> {

}
