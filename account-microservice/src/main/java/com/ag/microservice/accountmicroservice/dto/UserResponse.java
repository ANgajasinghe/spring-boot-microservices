package com.ag.microservice.accountmicroservice.dto;

public class UserResponse {
    private String UserId;
    private String Message;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
