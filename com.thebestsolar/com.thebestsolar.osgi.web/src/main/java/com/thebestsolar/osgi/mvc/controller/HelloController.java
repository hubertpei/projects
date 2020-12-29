package com.thebestsolar.osgi.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * https://www.tutorialspoint.com/spring/spring_mvc_hello_world_example.htm
 * @author i836432
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}
