package com.section1.Code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CoderClass {

	@RequestMapping("/")
	public String show() {
		return "welcome.jsp";
	}



	@RequestMapping(value = "code", method = RequestMethod.POST)
	public String verify(@RequestParam(value = "code") String pass) {
		if (pass.equals("bushido")) {
			return "code.jsp";
		}
		return "redirect:createError";

	}
	
	@RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    }
	
	@RequestMapping("code")
	public String code() {
		return "redirect:/";
	}
}
