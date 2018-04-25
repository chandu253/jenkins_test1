package com.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.entites.Person;
import com.pms.repository.PersionRepository;

@Service
public class PersonPersistencyService {

	@Autowired
	private PersionRepository persionRepository;
	
	public Person saveperson(Person person){
		return persionRepository.save(person);
	}
	
	public List<Person> saveAllPersons(List<Person> persons){
		return (List<Person>) persionRepository.saveAll(persons);
	}
	
	public List<Person> findAllPersons(){
		return (List<Person>) persionRepository.findAll();
	}
	
	public Optional<Person> findById(Integer id){
		return persionRepository.findById(id);
	}
	
	public void deleteById(Integer id){
		persionRepository.deleteById(id);
	}

	public Person findBylastName(String lastName) {
		return persionRepository.findByLastName(lastName);
	}

	public List<Person> findBylastNameAndfirstName(String lastName, String firstName) {
		return persionRepository.findByLastNameAndFirstName( lastName,  firstName) ;
	}

	public List<Person> getPersionByLastName(String lastName) {
		return persionRepository.getPersionByLastName(lastName);
	}

	public List<Person> getPersonByFirstName(String firstName) {
		return persionRepository.getPersonByFirstName(firstName);
	}

	

	
}
