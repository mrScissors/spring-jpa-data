package com.sudhindra.jpaDemo.service;

import com.sudhindra.jpaDemo.model.User;
import com.sudhindra.jpaDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public List<User> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


    public User saveUser(User userToBeSaved) {
        UUID uuid = UUID.randomUUID();
        userToBeSaved.setUserId(uuid);
        return userRepository.save(userToBeSaved);
    }
}