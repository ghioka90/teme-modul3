package com.devmind.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devmind.spring.model.User;

@Controller
public class HomeController {


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// un request de tip GET pe calea "/" ajuns pe server
	// va fi interceptat de DispacherServlet, si trimis in
	// aceasta metoda
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("phoneNo", user.getPhoneNo());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("address", user.getAddress());
		return "user";

	}
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(@Validated User user, Model model) {
		System.out.println("My Page Requested");
		return "about";
	}
}
