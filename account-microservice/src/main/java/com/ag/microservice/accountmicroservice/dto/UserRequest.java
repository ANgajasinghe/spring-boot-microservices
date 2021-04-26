package com.ag.microservice.accountmicroservice.dto;

public class UserRequest {
    private String FullName;
    private String age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
