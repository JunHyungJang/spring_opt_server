package com.example.spring_opt_test.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByName(String name);
//    UserEntity findById(Long id);
}
