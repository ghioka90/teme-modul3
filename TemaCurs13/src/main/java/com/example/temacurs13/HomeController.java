package com.example.temacurs13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@Controller
public class HomeController {

@Autowired
TimeZoneService timeZoneServ;
@Autowired
HarryPotterService	harryPotterName;
@Autowired
MathService mathOperation;
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

//	@RequestMapping(value = "/time", method = RequestMethod.GET)
//	public LocalDateTime currentHour(@RequestParam(name = "timeZone") String timeZone){
//		return timeZoneServ.getTimeByZone(timeZone);
//	}

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ResponseEntity<CustomResponse> getTime(@RequestParam String timeZone) {
		timeZone = timeZone.toUpperCase();
		validateTimeZone(timeZone);
		LocalDateTime dateTime = LocalDateTime.now(ZoneId.of(timeZone, ZoneId.SHORT_IDS));
		String currentTime = DateTimeFormatter.ofPattern("HH:mm:ss").format(dateTime);
		CustomResponse response = CustomResponse.builder()
				.result(currentTime)
				.build();

		return ResponseEntity.ok().body(response);
	}

	private void validateTimeZone(String timeZone) {
		List<String> accepted = List.of("UTC", "CET", "EET", "GMT", "EAT");
		if (!accepted.contains(timeZone)) {
			throw new IllegalArgumentException("Timezone not supported");
		}
	}

	@RequestMapping(value="/harry-potter", method = RequestMethod.GET)
	public ResponseEntity<CustomResponse> getHarryPotterCharacter() {
		CustomResponse response = CustomResponse.builder()
				.result(harryPotterName.getName())
				.build();

		return ResponseEntity.ok().body(response);
	}
	@RequestMapping(value="/math-service", method = RequestMethod.POST)
	public ResponseEntity<CustomResponse> postMathCalculation(@RequestBody MathEquation mathEquation) {
		CustomResponse response = CustomResponse.builder()
				.result(String.valueOf(mathOperation.getResult(mathEquation)))
				.build();

		return ResponseEntity.ok().body(response);
	}
}
