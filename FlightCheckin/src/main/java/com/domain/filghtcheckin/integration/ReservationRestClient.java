package com.domain.filghtcheckin.integration;

import com.domain.filghtcheckin.integration.dto.Reservation;
import com.domain.filghtcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
