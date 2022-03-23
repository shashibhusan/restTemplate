package com.restTemplate.restTemplate.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


@RestController
public class RestTemplateExample {

	@GetMapping("/getUser")
	public List<Employee> getUserData() {
		try {
			List<Employee> empList=new ArrayList<Employee>();
			String url = "http://localhost:8083/springDataDemo/restTemplateExample01";
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<Void> requestEntity = new HttpEntity<>(null, headers);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			RestTemplate restTemplate=new RestTemplate();
			ResponseEntity<Employee[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
					Employee[].class);
			if(response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
				return Arrays.asList(Objects.requireNonNull(response.getBody()));
            }
            return empList;
		} catch (RestClientException e) {
			throw new RuntimeException("Could not fetch RenetionPeriod data", e);
		}
		 
	}

}
