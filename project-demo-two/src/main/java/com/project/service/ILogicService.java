package com.project.service;

import java.util.List;

import com.project.domain.Person;

public interface ILogicService {
	public List<Person> getAllPerson();
	
	public Person getPersonByName(String name);
}
