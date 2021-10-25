package com.codingdojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String homePage( Model model ) {
		return "index.jsp";
	}
	
	@RequestMapping( value = "/date", method = RequestMethod.GET )
	public String datePage( Model model ) {
		
		Date dateInfo = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		String dateString = formatDate.format( dateInfo );
		
		model.addAttribute("date", dateString );
		return "date.jsp";
	}
	
	@RequestMapping( value = "/time", method = RequestMethod.GET )
	public String timePage( Model model ) {
		
		Date date = new Date();
		SimpleDateFormat formatTime = new SimpleDateFormat( "hh:mm aa" );
		String time = formatTime.format( date );
		
		
		model.addAttribute("time", time );
		
		return "time.jsp";
	}

}
