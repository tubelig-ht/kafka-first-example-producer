package com.kafkaexample.Kafka.Example.service;

import com.kafkaexample.Kafka.Example.constants.AppConstants;
import com.kafkaexample.Kafka.Example.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public String addMsg(Order order){
        kafkaTemplate.send(AppConstants.TOPIC,order);
        return "Msg Published to Kafka";
    }


}
