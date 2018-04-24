package com.moneyapi.resource;

import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.moneyapi.model.Person;
import com.moneyapi.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonResource {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping
	public List<Person> read(){
		return personRepository.findAll();
	}
	
	public ResponseEntity<Person> create (@Valid @RequestBody Person person){
		Person personSaved = personRepository.save(person);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id")
				.buildAndExpand(personSaved.getId()).toUri();
		return ResponseEntity.created(uri).body(personSaved);
		
	}
	
	
	@GetMapping("/{id}")
	public Person findOne(@PathVariable Long id){
		return personRepository.findOne(id);
	}

}
