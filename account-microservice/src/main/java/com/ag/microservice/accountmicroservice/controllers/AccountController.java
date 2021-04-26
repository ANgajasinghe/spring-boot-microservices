package com.ag.microservice.accountmicroservice.controllers;

import com.ag.microservice.accountmicroservice.dto.UserRequest;
import com.ag.microservice.accountmicroservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/account",consumes = "application/json",produces = "application/json")
public class AccountController {

    @PostMapping()
    public @ResponseBody
    UserResponse
    CreateOrder(@RequestBody UserRequest request) {

        System.out.println("User Details" + request);

        var userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully Created Order");
        return userResponse;
    }

}
