package com.example.scriptkill.userinfo.dao;

import com.example.scriptkill.userinfo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface UserInfoDao {
//    List<UserInfo> getAllList();
    UserInfo get(int id);

    Integer insert(UserInfo userInfo);
    Integer update(UserInfo userInfo);
    Integer delete(Integer id);

}
