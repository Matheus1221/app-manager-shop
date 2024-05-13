package br.com.quon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quon.model.Client;
import br.com.quon.services.ClientService;

@RestController
@RequestMapping("/client")
public class AppManagerController {
	
	@Autowired
	public ClientService service; 

	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Client findById(@PathVariable(value = "id") String id){
		
	return service.findById(id);
	}
	
	@PostMapping
	public Client create(@RequestBody Client client) {
		return service.update(client);
	}
	
	
	@DeleteMapping("/{id}")
	public responseEntity<? delete(id)
	
	

}
