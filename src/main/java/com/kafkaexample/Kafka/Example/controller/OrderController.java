package com.kafkaexample.Kafka.Example.controller;

import com.kafkaexample.Kafka.Example.entity.Order;
import com.kafkaexample.Kafka.Example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public String createOrder(@RequestBody Order order){
        return orderService.addMsg(order);
    }

}

