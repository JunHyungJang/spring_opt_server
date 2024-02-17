package com.example.spring_opt_test.controller;


import com.example.spring_opt_test.dto.UserDto;
import com.example.spring_opt_test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(Environment env, UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/hello")
    public String status() {
        UserDto userdto = new UserDto();

        for (int i =0; i< 10 ; i++ ) {
            userdto.setName("name" + i);
            userdto.setPassword("password" + i);
//            log.info(userdto.getPassword());
            userService.createUser(userdto);
        }
        return "HELLO";
    }
}
