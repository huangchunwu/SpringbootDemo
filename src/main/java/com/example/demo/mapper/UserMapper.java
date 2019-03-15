package com.example.demo.mapper;

import com.example.demo.domain.UserEntity;

import java.util.List;

/**
 * Created by huangchunwu on 2019/3/15.
 */
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
