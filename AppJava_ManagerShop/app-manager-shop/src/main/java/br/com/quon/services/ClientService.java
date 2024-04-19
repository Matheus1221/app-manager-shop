package br.com.quon.services;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.quon.model.Client;

@Service
public class ClientService {

	
	private final AtomicLong counter = new AtomicLong();
	
	private Logger logger = Logger.getLogger(ClientService.class.getName());
	
	
	public Client findById(String id) {
		
		Client client = new Client();
		
		logger.info("Finding one person!");
		client.setId(counter.incrementAndGet());
		client.setFirstName("José");
		client.setLastName("Zakuja");
		client.setGender("Male");
		client.setBirthDay(new Date());
		client.setNameUser("Jozézin2313");
		client.setUserPassword("SSSSAA23312");
		return client;
		
	}
	
}
