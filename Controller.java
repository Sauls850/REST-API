package com.study.rest.SpringRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	//added annotation and created method for GET http web request to retrieve data
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String helloWorld(@RequestParam(value = "name", defaultValue = "world") String name) {
		return "hello" + name;
	}
	//add annotations and method for POST http web request to return data
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String helloWorld2(@RequestBody String name) {
		return "hello" + name;
	}
	
	
}
