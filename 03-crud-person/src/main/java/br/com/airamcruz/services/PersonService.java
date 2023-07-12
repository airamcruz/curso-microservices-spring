package br.com.airamcruz.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.airamcruz.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	
	public List<Person> findAll() {
		
		List<Person> persons = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person findById(String id) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leonardo Airam");
		person.setLastName("Muniz Cruz");
		person.setAddress("Camaçari");
		person.setGender("Male");
		
		return person;
	}
	
	public Person create(Person person) {		
		return person;
	}
	
	public Person update(Person person) {		
		return person;
	}
	
	public void delete(String id) {
		
	}

	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Pessoa " + i);
		person.setLastName("Sobrenome");
		person.setAddress("Camaçari");
		person.setGender("Male");
		
		return person;
	}
}
