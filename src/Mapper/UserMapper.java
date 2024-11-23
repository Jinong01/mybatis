package Mapper;

import org.apache.ibatis.annotations.*;
import pojo.User;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where id = #{id};")
    public User select(int id);

    @Insert("insert into user (userid , password) values (#{userid} , #{password});")
    void insert(@Param("userid") String userid , @Param("password") String password);

    @Delete("delete from user where id =#{id};")
    void delete(int id);

    @Update("update user set userid = #{userid} where id = #{id};")
    void update(@Param("userid")String userid , @Param("id") int id);
}
