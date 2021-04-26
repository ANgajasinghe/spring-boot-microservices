package com.ag.microservice.orderservice.controller;

import com.ag.microservice.orderservice.dto.OrderRequest;
import com.ag.microservice.orderservice.dto.OrderResponse;
import com.ag.microservice.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api",consumes = "application/json",produces = "application/json")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public @ResponseBody
    OrderResponse
    CreateOrder(@RequestBody OrderRequest request) {
        return orderService.CreateOrder(request);
    }

}
