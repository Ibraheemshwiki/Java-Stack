package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodingDojoController {

	@RequestMapping("coding")
	public String coding() {
		return "<h1>Hello Coding Dojo!</h1>";
	}

	@RequestMapping("coding/python")
	public String python() {
		return "<h1>Python/Django was awesome!</h1>";
	}

	@RequestMapping("coding/java")
	public String java() {
		return "<h1>Java/Spring is better!</h1>";
	}

}
