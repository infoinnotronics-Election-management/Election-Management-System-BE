package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
public class UserLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userLevelId;

    private String userLevelName;

    // Getters and Setters
    public Long getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Long userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }
}
