package com.sudhindra.jpaDemo.UserController;

import com.sudhindra.jpaDemo.service.UserService;
import com.sudhindra.jpaDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userName}")
    public List<User> getUserByUserName(@PathVariable("userName") String userName) {
        return userService.getUserByUserName(userName);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User userData) {
        User savedUser = userService.saveUser(userData);
        return savedUser;
    }
}