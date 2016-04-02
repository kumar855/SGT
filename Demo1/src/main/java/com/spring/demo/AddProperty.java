package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AddProperty {
	@RequestMapping(value="AddStudentProp" ,method=RequestMethod.POST)
	private String AddStudentProp(@ModelAttribute Student student, RedirectAttributes redirctattr){
		redirctattr.addFlashAttribute("student",student);
		return "helloStudent";
	}

}
