package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class greeting {
	@RequestMapping("/") 
	public String index(@RequestParam(value="q", required=false) String name) {
		if (name != null) {
			return "<h1> Hello " + name  + "! </h1> <br><p> Welcome to SpringBoot! </p>" ;
		}
		else {
			return "<h1> Hello Human! </h1><br><p> Welcome to SpringBoot! </p>";
		}
	    
	}
}
