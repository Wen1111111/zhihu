package com.example.zhihu.dao;


import com.example.zhihu.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    String TABLE_NAME = "user";
    String INSERT_FILEDS = " name, password, salt, head_url";
    String SELECT_FILEDS = "id, "+ INSERT_FILEDS;
    @Insert({"insert into",TABLE_NAME,"(",INSERT_FILEDS,")" +
            " values(#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);
}
