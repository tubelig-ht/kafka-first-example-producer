package com.kafkaexample.Kafka.Example.entity;

import lombok.Data;

@Data
public class Order {

    private String id;
    private String name;
    private Double price;
    private String email;

}
