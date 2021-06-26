package com.section1.DojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.section1.DojosNinjas.models.Dojo;
import com.section1.DojosNinjas.models.Ninja;
import com.section1.DojosNinjas.services.DojoNinjaService;

@Controller
public class DojoNinjaController {

		private final DojoNinjaService service;
		public DojoNinjaController(DojoNinjaService serv) {
			this.service = serv;
		}
		
		
		// Landing page with creating the dojo ---------------------
		@RequestMapping("/dojos/new")
		public String dojoIndex(Model model, @ModelAttribute("dojo") Dojo dojo) {
			List<Dojo> dojo1 = service.allDojos();
			model.addAttribute("Dojos", dojo1);
			return "newDojo.jsp";
		}
		
		@RequestMapping(value="/createDojo", method=RequestMethod.POST)
		public String CreateDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
			if(result.hasErrors() ) {
				return "newDojo.jsp";
			}
				service.createDojo(dojo);
				return "redirect:/dojos/new";
			}
		
		
		// Ninja page with creating a ninja ----------======-----------
		@RequestMapping("/ninjas/new")
		public String ninjaIndex(Model model, @ModelAttribute("ninja") Ninja ninja) {
			List<Dojo> dojo = service.allDojos();
			model.addAttribute("dojos", dojo);
			return "newNinja.jsp";
		}
		
		@RequestMapping(value="/createNinja", method=RequestMethod.POST)
		public String CreateNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			if(result.hasErrors() ) {
				return "newNinja.jsp";
			}
				service.createNinja(ninja);
				return "redirect:/ninjas/new";
			}
		
		// The Show methods --------===============================---------
		
		@RequestMapping("/show/{id}")
		public String ShowDojo(@PathVariable("id") Long id, Model model) {
			Dojo dojo1 = service.findDojo(id);
			List<Ninja> dojoNinja = dojo1.getNinjas();
			model.addAttribute("dojo", dojo1.getName());
			model.addAttribute("dojoNinja", dojoNinja);
			return "show.jsp";
		
			}
}

