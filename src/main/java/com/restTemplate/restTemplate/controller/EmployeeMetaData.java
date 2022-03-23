package com.restTemplate.restTemplate.controller;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EmployeeMetaData implements Serializable {
	@JsonProperty("value")
	 private List<Employee> value;
}
