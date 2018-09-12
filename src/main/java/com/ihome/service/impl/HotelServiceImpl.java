package com.ihome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ihome.repository.HotelMapper;
import com.ihome.service.HotelService;
import com.ihome.domain.Hotel;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelMapper hotelMapper;
	
	@Transactional
	@Override
	public int insertHotel(Hotel hotel) {
		hotelMapper.insertHotel(hotel);
		return hotel.getId();
	}
	
	@Transactional
	@Override
	public List<Hotel> getRandomHotels() {
		return hotelMapper.getRandomHotels();
	}
	
}
