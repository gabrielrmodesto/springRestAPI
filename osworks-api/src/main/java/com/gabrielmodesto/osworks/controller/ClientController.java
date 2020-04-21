package com.gabrielmodesto.osworks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielmodesto.osworks.domain.model.Client;

@RestController
public class ClientController {

	@GetMapping("/clients")
	public List<Client> list() {
		var client1 = new Client();
		
		client1.setId(1L);
		client1.setName("Gabriel");
		client1.setEmail("email1@email.com");
		client1.setTelphone("12 99990-0909");
		
		var client2 = new Client();
	
		client2.setId(2L);
		client2.setName("Thais");
		client2.setEmail("email2@email.com");
		client2.setTelphone("12 90900-0909");
		
		return Arrays.asList(client1, client2);
	}
}
