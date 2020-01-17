package com.whut.Service;

import com.whut.Dao.userDao;
import com.whut.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class userService implements IUserService {
    @Autowired
    private  userDao dao;

    @Override
    public userInfo loginUser(userInfo user)
    {
        return dao.loginUser(user);
    }


    public userInfo getUser(int Id){
        return dao.getUser(Id);
    }

}
