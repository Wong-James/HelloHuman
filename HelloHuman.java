package com.james.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String Coding(@RequestParam(value="q", required=false) String query) {
		if(query == null) {
			return "<h1>Hello Human</h1> </br><h3>Welcome to SpringBoot!</h3>" ;
		} else {
			return "<h1>Hello " + query + "</h1></br> <h3>Welcome to SpringBoot!</h3>";
		}
	}
	

}
