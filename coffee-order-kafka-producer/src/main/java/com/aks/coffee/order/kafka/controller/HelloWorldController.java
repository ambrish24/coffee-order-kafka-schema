package com.aks.coffee.order.kafka.controller;

import com.aks.coffee.order.kafka.producer.HelloKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloKafkaProducer helloKafkaProducer;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("msg") String msg){
        return helloKafkaProducer.sendMessage(msg);
    }
    @PostMapping("/publish")
    public String publishObject(@RequestBody String obj){
        return helloKafkaProducer.sendMessage(obj);
    }
}
