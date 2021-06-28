package com.section1.Lookify.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.section1.Lookify.Services.LookifyService;
import com.section1.Lookify.models.Lookify;


@Controller
public class LookifyApi {
    private final LookifyService lookifyService;
    public LookifyApi(LookifyService lookifyService){
        this.lookifyService = lookifyService;
    }
    
    @RequestMapping("/dashboard")
    public String index(Model model) {
    	model.addAttribute("songs", lookifyService.allLookifies());
        return "dashboard.jsp";
    }
    
    @RequestMapping("/")
    public String welcome() {
    	return "/welcome.jsp";
    }
    
    
    @RequestMapping("/song/new")
    public String newPage(Model model, @ModelAttribute Lookify lookify) {
    	return "/newSong.jsp";
    }
    
    @PostMapping("/createSong")
    public String CreateSong(@Valid @ModelAttribute("lookify") Lookify lookify, BindingResult result) {
		if(result.hasErrors() ) {
			return "newSong.jsp";
		}
		lookifyService.createLookify(lookify);
			return "redirect:/";
		}
    
    @RequestMapping("/api/lookifies/{id}")
    public Lookify show(@PathVariable("id") Long id) {
    	Lookify lookify = lookifyService.findLookify(id);
        return lookify;
    }
    @RequestMapping(value="/api/lookifies/{id}", method=RequestMethod.PUT)
    public Lookify update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") Integer rating) {
    	Lookify book = lookifyService.updateLookify(id, title, artist, rating);
        return book;
    }
    
    @RequestMapping("/lookifies/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
    	lookifyService.deletesong(id);
    	return "redirect:/dashboard";
    }
    
    @RequestMapping("/song/{id}")
    public String showDetails(@PathVariable("id") Long id, Model model) {
    	Lookify song = lookifyService.findLookify(id);
    	model.addAttribute("song", song);
    	return "showDetails.jsp";
    }
    
    @RequestMapping("/search")
    public String search(@RequestParam("artist") String artist) {
    	
    	return "redirect:/search/" + artist;
    	
    }
    
    @RequestMapping("/search/{artist}")
    public String showArtist(@PathVariable("artist") String artist, Model model) {
    	List<Lookify> thisArtist = lookifyService.findArtist(artist);
    	model.addAttribute("artistList", thisArtist);
    	model.addAttribute("artist", artist);
    	return "songsByArtist.jsp";
    	
    }
}