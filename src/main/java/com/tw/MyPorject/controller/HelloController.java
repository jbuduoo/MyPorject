package com.tw.MyPorject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String hello() {
		// mapped to http://localhost:8080/
		return "Hello Spring Boot!!";
	}

	@RequestMapping("/hello")
	String hello1() {
		// mapped to http://localhost:8080/index/
		return "Hello";
	}

	@RequestMapping(value = { "/page", "page*", "view/*", "**/msg" })
	String indexMultipleMapping() {
		//mapped to http://localhost:8080/home/page
		//mapped to http://localhost:8080/home/pageabc
		//mapped to http://localhost:8080/home/view/
		return "Hello from index multiple mapping. ";
	}
}
