package com.aks.coffee.order.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class HelloKafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	//@Value("${kafka.topic}")
	private String topic;

	public String sendMessage(String message){

		//kafkaTemplate.send(topic, message);

		return "Message Published";
	}
}
