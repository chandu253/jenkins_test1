package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pms.entites.Person;

public interface PersionRepository extends CrudRepository<Person, Integer>  {

	Person findByLastName(String lastName);

	List<Person> findByLastNameAndFirstName(String lastName, String firstName);

	List<Person> getPersionByLastName(String lastName);

	@Query("SELECT p FROM Person p WHERE p.firstName=?1")
	List<Person> getPersonByFirstName(String firstName);

}
