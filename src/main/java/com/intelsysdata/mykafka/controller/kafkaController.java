package com.intelsysdata.mykafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.intelsysdata.mykafka.services.*;

@RestController
@RequestMapping(value = "/kafka")
public class kafkaController {
	
	
	private final Producer producer;
	
	public kafkaController(Producer producer) {
		this.producer = producer;
	}
	
	@PostMapping( value= "kirim" )
	public void sendMessage(@RequestParam("message") String message) {
		producer.sendMessage(message);
		System.out.println("--------->Kirim");
		
		
	}
	
}
