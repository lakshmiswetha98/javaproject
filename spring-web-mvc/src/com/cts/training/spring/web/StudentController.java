package com.cts.training.spring.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "student-profile";
	}
	
	
	@RequestMapping() 
	public String defaultMethod() {
		return "student-home";
	}
	
	
	@RequestMapping("*") 
	public String fallbackMethod() {
		return "student-error";
	}
}