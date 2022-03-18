package com.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.entity.EmailDto;
import com.location.entity.Location;
import com.location.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	@RequestMapping("compose")
	public String composeEmail(@ModelAttribute("location") Location location,ModelMap modelMap ) {
		modelMap.addAttribute("location",location);
		return "composeMail";
	}
	@RequestMapping("sendEmail")
	public String sendEmailtoUser(EmailDto emailDto,ModelMap modelMap) {
		String email=emailDto.getEmail();
		String body = emailDto.getBody();
		String subject = emailDto.getSubject();
		emailService.sendSimpleMessage(email, subject, body);
		modelMap.addAttribute("msg","email sent!");
		return "composeMail";
	}

}
