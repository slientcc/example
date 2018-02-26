package com.saber.dao;

import com.saber.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/23 下午12:02
 */
@Mapper
public interface UserDAO {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);
}
