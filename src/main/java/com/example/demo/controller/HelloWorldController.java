package com.example.demo.controller;

import com.example.demo.domain.Language;
import com.example.demo.domain.UserEntity;
import com.example.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangchunwu on 2019/3/15.
 */
@RestController
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String index(Language language) {
        logger.info("asasasaas");
        return "Hello World";
    }
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(){
       return userService.getAll();
    }
}
