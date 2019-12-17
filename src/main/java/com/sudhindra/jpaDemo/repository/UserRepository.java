package com.sudhindra.jpaDemo.repository;

import com.sudhindra.jpaDemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, Integer> {
    public List<User> findByUserName(String userName);
}