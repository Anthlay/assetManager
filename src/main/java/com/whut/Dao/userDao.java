package com.whut.Dao;

import com.whut.beans.*;

import java.util.List;
import java.util.Map;

public interface userDao {
    public userInfo loginUser(userInfo user);//登陆检查
    public userInfo getUser(int Id);//得到指定用户信息



}
