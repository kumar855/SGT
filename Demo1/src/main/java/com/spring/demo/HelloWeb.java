package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HelloWeb {
	
	@RequestMapping(value="HelloWeb" )

	public String printData(RedirectAttributes redirctattr){
		System.out.println("in controller");
		redirctattr.addFlashAttribute("message","hello world");
		  return "redirect:HelloWeb1";
	}
	@RequestMapping(value="HelloWeb1" )

	public String printData1( RedirectAttributes redirctattr){
		  return "hello";
	}
	@RequestMapping(value="addstudent" ,method=RequestMethod.POST)
	private String AddStudent(@ModelAttribute Student student, RedirectAttributes redirctattr){
		System.out.println("hrllo");
		redirctattr.addFlashAttribute("student",student);
		return "helloStudent";
	}
}
