package com.RestAPI.webservices.restfulwebservices;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.webservices.restfulwebservices.HelloWorldBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

//	@RequestMapping(method=RequestMethod.GET , path="/hello-world")
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello natesh";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean HelloBean() {
//		throw new RuntimeException("some error happened");
		return new HelloWorldBean("hello natesh ");
	}

	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean HelloBeanPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello beanie - %s", name));
	}
}