package com.epam.javacc.microservices.controller.dto;

public class HelloResponseDto {

	private String name;
	
	public HelloResponseDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
