package com.jinxin.springbootdemo.mapper;

import com.jinxin.springbootdemo.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JinXin
 * @Date 2019/3/15 14:14
 */
@Mapper
@Repository
public interface UserMapper {

    List<UserDO> getUsers();

}
