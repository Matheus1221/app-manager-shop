package br.com.quon.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quon.model.Clients;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clients")
public class AppManagerController {
	
	
	private Clients client; 

	@GetMapping(value = "/id")
	public List<Clients> findAll(){
		
		
		return null;
	}
	
	
	

}
