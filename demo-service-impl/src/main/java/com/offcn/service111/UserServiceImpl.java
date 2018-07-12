package com.offcn.service111;

import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {

        return userMapper.getUserList();
    }
}
