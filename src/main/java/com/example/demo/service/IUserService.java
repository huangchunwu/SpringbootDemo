package com.example.demo.service;

import com.example.demo.domain.UserEntity;

import java.util.List;

/**
 * Created by huangchunwu on 2019/3/15.
 */
public interface IUserService {

    List<UserEntity> getAll();
}
