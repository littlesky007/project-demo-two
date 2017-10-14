package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.domain.Person;
import com.project.service.ILogicService;
@Service
public class LogicServiceImpl implements ILogicService{

	@Override
	public List<Person> getAllPerson() {
		List<Person> persons = new ArrayList<Person>();
		Person p = new Person();
		p.setName("张三");
		p.setAge(22);
		persons.add(p);
		p = new Person();
		p.setName("李四");
		p.setAge(23);
		persons.add(p);
		System.out.println(persons.size());
		return persons;
	}

	@Override
	public Person getPersonByName(String name) {
		Person p = new Person();
		p.setName(name);
		p.setAge(22);
		return p;
	}
}
