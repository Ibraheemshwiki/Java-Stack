package com.section1.Survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DojoSurvey {

	@RequestMapping("")
	public String survey() {
		return "theForm.jsp";
	}

	@PostMapping("apply")
	public String apply(Model model, @RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="lang") String lang, @RequestParam(value="comment") String comment) {
	        model.addAttribute("name", name);
	        model.addAttribute("location", location);
	        model.addAttribute("lang", lang);
	        model.addAttribute("comment", comment);
		return "info.jsp";
	}	
	}

