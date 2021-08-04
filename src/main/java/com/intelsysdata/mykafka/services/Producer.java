package com.intelsysdata.mykafka.services;

import org.springframework.stereotype.Service;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.*;

@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "user";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		logger.info(String.format("----> %s", message));
		this.kafkaTemplate.send(TOPIC,message);
	}
	

}
