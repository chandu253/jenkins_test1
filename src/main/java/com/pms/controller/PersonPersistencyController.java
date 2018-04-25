package com.pms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pms.entites.Person;
import com.pms.service.PersonPersistencyService;

@Controller
public class PersonPersistencyController {

	@Autowired
	private PersonPersistencyService personPersistencyService;

	@RequestMapping(method = RequestMethod.GET, path = "/persion.htm")
	public String showPersonForm() {
		return "persion";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/save-person.htm")
	public String savePersion(@ModelAttribute Person person) {

		Person p = personPersistencyService.saveperson(person);
		if (p != null) {
			return "persion-success";
		}
		return null;
	}

	//it should be post
	@RequestMapping(method=RequestMethod.GET,path="/save-all.htm")
	public String saveAllPersons() {
		Person person1 = new Person("siva", "k", "siav@gmial.com", "56956");
		Person person2 = new Person("moli", "ch", "moli@gmial.com", "9556");
		Person person3 = new Person("sam", "k", "sam@gmial.com", "98635");
		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		List<Person> p = personPersistencyService.saveAllPersons(persons);
		if (p != null) {
			return "persion-success";
		}
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/find-all.htm")
	public String findAllPersons(){
		
		System.out.println(personPersistencyService.findAllPersons());
		return "persion-success";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/find-by-id.htm")
	public String findById(){
		Optional<Person> p1=personPersistencyService.findById(3);
		if(p1.isPresent()){
			System.out.println(p1.get());
		return "persion-success";
		}
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/delete-by-id.htm")
	public String deleteById(){
		personPersistencyService.deleteById(2);
		return "persion-success";
	}
}






