package com.section1.StringPractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class welcome {
@RequestMapping("")
public String welcome() {
return "<h1> Hello Client! How are you doing? </h1>";
}

@RequestMapping("random")
public String random() {
	return "<h1> SpringBoot it great! So EZ </h1>";
}
}
