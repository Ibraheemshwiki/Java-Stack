package com.section1.NinjaGold;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class NinjaGold {

	public ArrayList<String> activities;


	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
			activities = new ArrayList<String>();
		}
		model.addAttribute("activities", activities);
		return "ninja.jsp";
	}

	@PostMapping("/")
	public String process(@RequestBody() String location, HttpSession session) {
		String building = location.substring(location.indexOf("=") + 1, location.indexOf("."));
		Random random = new Random();
		int n = 0;
		int totalGold = (int) session.getAttribute("totalGold");
		String text = "you entered a ";

		switch (building) {
		case "farm":
			n = random.nextInt(10) + 10;
			break;
		case "house":
			n = random.nextInt(3) + 2;
			break;
		case "cave":
			n = random.nextInt(5) + 5;
			break;
		case "casino":
			n = random.nextInt(50);
			break;
		}
		text += building + " and earned gold " + n;
		activities.add(text);
		System.out.println(activities);
		totalGold += n;
		session.setAttribute("totalGold", totalGold);
		return "redirect:/";
	}
}
