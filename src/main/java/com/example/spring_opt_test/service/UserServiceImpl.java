package com.example.spring_opt_test.service;

import com.example.spring_opt_test.dto.UserDto;
import com.example.spring_opt_test.jpa.UserEntity;
import com.example.spring_opt_test.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userdto) {
        ModelMapper mapper = new ModelMapper();

        UserEntity userEntity =mapper.map(userdto,UserEntity.class);

        userRepository.save(userEntity);

        return userdto;
    }


}
