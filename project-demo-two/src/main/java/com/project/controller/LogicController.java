package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.domain.Person;
import com.project.service.ILogicService;

@Controller
@RequestMapping("/logicController")
public class LogicController {
	
	@Autowired
	private ILogicService logicServiceImpl;
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	public @ResponseBody List<Person> getAllPerson(){
		return logicServiceImpl.getAllPerson();
	}
	
	@RequestMapping(value = "/getPerson/{name}" , method = RequestMethod.GET)
	public @ResponseBody Person getPerson(@PathVariable("name") String name)
	{
		return logicServiceImpl.getPersonByName(name);
	}
	@RequestMapping(value = "/getPersonByCondition" , method = RequestMethod.POST)
	public @ResponseBody Person getPersonByCondition(@RequestParam String name)
	{
		return logicServiceImpl.getPersonByName(name);
	}

}
