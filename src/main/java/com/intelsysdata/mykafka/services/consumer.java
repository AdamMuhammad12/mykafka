package com.intelsysdata.mykafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

import org.slf4j.*;


@Service
public class consumer {
	private final Logger logger = LoggerFactory.getLogger(consumer.class);
	
	@KafkaListener(topics = "user", groupId = "group_id")
	private void consumer(String message) throws IOException{
		logger.info(String.format("Consume ----> %s", message));
		
	}

}
