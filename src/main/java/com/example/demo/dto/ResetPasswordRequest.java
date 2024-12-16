package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ResetPasswordRequest {

    @NotBlank(message = "Token is required.")
    private String token;

    @NotBlank(message = "New password is required.")
    private String newPassword;

    // Getters and Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}

