package com.spring.admissioncontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Admissions")
public class AdmissionController {

	@RequestMapping(value="/form.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionform() {
		ModelAndView model = new ModelAndView("form");
		return model;
	}
	
	@RequestMapping(value="/submitsucess.html", method=RequestMethod.POST)
	public ModelAndView submitform(@RequestParam("name") String name,@RequestParam("hobby") String hobby)
	{
		
		ModelAndView model = new ModelAndView("sucess");
		
		model.addObject("msg","Details submitted are :"+name+ " and "+hobby);
		return model;
		
	}
}
