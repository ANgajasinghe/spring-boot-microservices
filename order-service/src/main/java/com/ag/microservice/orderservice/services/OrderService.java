package com.ag.microservice.orderservice.services;
import com.ag.microservice.orderservice.dto.OrderRequest;
import com.ag.microservice.orderservice.dto.OrderResponse;
import com.ag.microservice.orderservice.dto.UserCreationRequest;
import com.ag.microservice.orderservice.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.UUID;

@Service
public class OrderService {


    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse CreateOrder(OrderRequest orderRequest){
        var userCreationRequest = new UserCreationRequest();
        userCreationRequest.setFullName("Akalanka Nayanajith");
        userCreationRequest.setAge("23");
        var res = restTemplate.postForEntity("http://localhost:8080/users",userCreationRequest, UserResponse.class);

        var orderResponse = new OrderResponse();
        orderResponse.setUserId(Objects.requireNonNull(res.getBody()).getUserId());
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setMessage("Successfully Created Order");

        return orderResponse;
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
