package com.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pms.entites.Person;
import com.pms.service.PersonPersistencyService;

@SpringBootApplication(scanBasePackages={"com.pms.controller","com.pms.service"})
public class PeopleManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSystemApplication.class, args);
	}
	
	@Autowired
	private PersonPersistencyService personPersistencyService; 

	@Override
	public void run(String... args) throws Exception {
		//findBylastName("billa");
		//findBylastNameAndfirstName("k","siva");
		
		//using @namequery
		//getPersionByLastName( "k");
		
		//using @query
		//getPersonByFirstName("siva");
	}

	private void getPersonByFirstName(String firstName) {
		
		List<Person> list=personPersistencyService.getPersonByFirstName(firstName);
		System.out.println(list.get(0));
	}

	private void getPersionByLastName(String lastName) {
		List<Person> list=personPersistencyService.getPersionByLastName(lastName);
		System.out.println(list.get(0));
		
	}

	private void findBylastNameAndfirstName(String lastName, String firstName) {
		List<Person> list=personPersistencyService.findBylastNameAndfirstName(lastName, firstName);
		System.out.println(list.size());
	}

	private void findBylastName(String lastName) {
		Person person=personPersistencyService.findBylastName(lastName);
		System.out.println(person);
	}
	
	
	
}
