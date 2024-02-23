package com.aks.coffee.order.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class HelloKafkaConsumer {

	//@KafkaListener(topics = "${kafka.topic}")
	public void listen(Message<String> msg){
		System.out.println("######### Reading from topic - "+"t_helloworld");
		System.out.println(msg.getPayload());
	}

}
