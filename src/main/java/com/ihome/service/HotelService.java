package com.ihome.service;

import java.util.List;

import com.ihome.domain.Hotel;

public interface HotelService {

	int insertHotel(Hotel hotel);
	
	List<Hotel> getRandomHotels();
}
