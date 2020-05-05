package main.java.ma.lndroid.tp.controllers.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.ma.lndroid.tp.beans.form.Reservation;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	
	private static String H_URL="/form/";
	
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation",reservation);
		return H_URL+"resevation-page";
	}
	
	@RequestMapping("/submitForm")
	public String sublitForm(@ModelAttribute("reservation") Reservation res) {
		return H_URL+"confirmation-page";
	}

}
