package com.restTemplate.restTemplate.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("userSalay")
	private int kuchhBhi;
}
