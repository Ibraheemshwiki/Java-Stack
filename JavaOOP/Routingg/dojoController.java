package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class dojoController {
	@RequestMapping("/{name}")
	public String dojo(@PathVariable("name") String name) {
		return "The " + name + " is awesome!";
	}

	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "Burbank-Dojo is located in Southern California";

	}

	@RequestMapping("/san-jose")
	public String sanjose() {
		return "SJ-dojo is the headquarters";

	}
}
