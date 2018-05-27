package com.domain.filghtcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domain.filghtcheckin.integration.ReservationRestClient;
import com.domain.filghtcheckin.integration.dto.Reservation;
import com.domain.filghtcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "checkIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId")Long reservationId,ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetials";
		
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(Long reservationId,@RequestParam("numberOfBags")int numberOfBags) {
			ReservationUpdateRequest updaterequest = new ReservationUpdateRequest();
			updaterequest.setId(reservationId);
			updaterequest.setCheckedIn(true);
			updaterequest.setNumberOfBags(numberOfBags);
			restClient.updateReservation(updaterequest);
		
		return "checkInConfirmation";
		
	}
}
