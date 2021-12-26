package com.example.scriptkill.userInfo.dao;

import com.example.scriptkill.userInfo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserInfoDao {
//    List<UserInfo> getAllList();
    UserInfo get(int id);
//    void insert(UserInfo userInfo);
//    void update(UserInfo userInfo);
//    void delete(int id);
}
