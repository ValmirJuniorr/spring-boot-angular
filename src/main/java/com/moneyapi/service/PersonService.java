package com.moneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.moneyapi.model.Person;
import com.moneyapi.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person update(Long id, Person person) {
		Person personSaved = findPersonByIdOrThrowExcption(id);
		BeanUtils.copyProperties(person, personSaved, "id");
		return personRepository.save(personSaved);
	}

	public void updateActiveProperty(Long id, Boolean active) {
		Person personSaved = findPersonByIdOrThrowExcption(id);
		personSaved.setActive(active);
		personRepository.save(personSaved);
		
	}
	
	private Person findPersonByIdOrThrowExcption(Long id) {
		Person personSaved = personRepository.findOne(id);
		if (personSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return personSaved;
	}

}
