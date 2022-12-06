package com.searchlead.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searchlead.dtopayload.Lead;

@Component
public class LeadRestClient {
	
	public Lead getLeadById(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Lead lead = restTemplate.getForObject("http://localhost:8080/api/postman/leadinfo/"+id, Lead.class);
		return lead;
	}
}
