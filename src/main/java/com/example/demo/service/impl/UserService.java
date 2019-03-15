package com.example.demo.service.impl;

import com.example.demo.domain.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangchunwu on 2019/3/15.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;


    public List<UserEntity> getAll(){
        return userMapper.getAll();
    }
}
