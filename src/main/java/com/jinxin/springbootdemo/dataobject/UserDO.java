package com.jinxin.springbootdemo.dataobject;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author JinXin
 * @Date 2019/3/15 14:21
 */
@Alias("userDO")
@Data
public class UserDO {
    private String name;
    private String age;
}
