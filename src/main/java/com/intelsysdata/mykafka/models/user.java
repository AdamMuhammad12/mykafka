package com.intelsysdata.mykafka.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class user {
	private String name;
	public int age;

}
