package service;

import Mapper.UserMapper;
import config.MysqlConfig;
import org.apache.ibatis.session.SqlSession;
import pojo.User;

import java.io.IOException;

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        MysqlConfig mysqlConfig = new MysqlConfig();
        SqlSession sqlSession = mysqlConfig.mysqlConnect();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update("근호",2);
    }
}
