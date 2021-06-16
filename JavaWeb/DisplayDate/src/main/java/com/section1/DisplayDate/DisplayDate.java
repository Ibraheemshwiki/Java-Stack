package com.section1.DisplayDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller


public class DisplayDate {
@RequestMapping("")
public String index(Model model) {
	
	
    return "home.jsp";
}
@RequestMapping("/time")
public String timeNow(Model model) {
	String time = new SimpleDateFormat("hh : mm aa").format(new Date());
	model.addAttribute("time", time);
	return "time.jsp";
}
@RequestMapping("/date")
public String dateNow(Model model) {
	DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
	String dayFormat = new SimpleDateFormat("EEEE").format(new Date());
	Date date = new Date();
	model.addAttribute("date", dateFormat.format(date));
	model.addAttribute("dayFormat", dayFormat);
	return "date.jsp";
}

}
