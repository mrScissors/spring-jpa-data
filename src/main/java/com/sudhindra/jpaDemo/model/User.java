package com.sudhindra.jpaDemo.model;


import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import java.util.UUID;

@Document
public class User {
    @Id
    private UUID userId;
    private String userName;
    private String location;


    public User() {
    }

    public User(UUID userId, String userName, String location) {
        this.userId = userId;
        this.userName = userName;
        this.location = location;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
