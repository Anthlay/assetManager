package com.whut.Service;

import com.whut.beans.*;

import java.util.List;

public interface IUserService {


    public userInfo loginUser(userInfo user);//登陆检查

    public userInfo getUser(int Id);//得到指定用户信息



    }