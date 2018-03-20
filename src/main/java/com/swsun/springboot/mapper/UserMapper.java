package com.swsun.springboot.mapper;

import com.swsun.springboot.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    @Select("select * from user_")
    List<User> findAll();

    @Insert(" insert into user_ (name,password,phone) values (#{name},#{password},#{phone}) ")
    public int save(User user);

    @Delete(" delete from user_ where id= #{id} ")
    public void delete(int id);

    @Select("select * from user_ where id= #{id} ")
    public User get(int id);

    @Update("update user_ set name=#{name},password=#{password},phone=#{phone} where id=#{id} ")
    public int update(User user);
}
