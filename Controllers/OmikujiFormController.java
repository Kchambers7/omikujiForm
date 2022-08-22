package com.annie.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
	
	// Redirect to /omikuji
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	//Display
	@RequestMapping("/omikuji")
	public String form() {
		return "showform.jsp";
	}
	// Action
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String processForm(@RequestParam(value="number") Integer number,
								@RequestParam(value="city") String city,
								@RequestParam(value="person") String person,
								@RequestParam(value="hobby") String hobby,
								@RequestParam(value="livingThing") String livingThing,
								@RequestParam(value="message") String messege,
								HttpSession session) {
		// add form data in session
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("message", message);
		
		// Use "Redirect" for POST 
		return "redirect:/omikuji/show";
	}
	// Display
	@RequestMapping("/omikuji/show")
	public String show() {
		return "show.jsp";
	}
	
	// GET 

    @GetMapping("/fortune")
    public String fortune(HttpSession session, Model model) {
    	Integer number = (Integer) session.getAttribute("number");
    	String city = (String) session.getAttribute("city");
    	String person = (String) session.getAttribute("person");
    	String hobby = (String) session.getAttribute("hobby");
    	String thing = (String) session.getAttribute("livingThing");
    	String something = (String) session.getAttribute("message");
    	
    	model.addAttribute("number", number);
    	model.addAttribute("city", city);
    	model.addAttribute("person", person);
    	model.addAttribute("hobby", hobby);
    	model.addAttribute("livingThing", livingthing);
    	model.addAttribute("message", message);
    	
    	return "fortune.jsp";
    }
    
    @GetMapping("/reset")
    public String reset(HttpSession session) {
    	session.invalidate();
    	return "index.jsp";
    }

	
}