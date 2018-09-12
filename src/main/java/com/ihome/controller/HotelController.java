package com.ihome.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihome.domain.Hotel;
import com.ihome.service.HotelService;

@CrossOrigin("http://localhost:3000")
@RestController
public class HotelController {

	@Resource(name = "hotelService")
	HotelService hotelService;
	
	@RequestMapping("/insert")
	public String insertHotel() {
		
		try {
 			FileInputStream fStream = new FileInputStream(new File("D:\\hotels\\datatest.txt"));
 			InputStreamReader iReader = new InputStreamReader(fStream,"gbk");
 			BufferedReader bReader = new BufferedReader(iReader);
 			
 			int id = 20180001;
 			String imgurl = "";
 			
 			while((imgurl = bReader.readLine())!=null){
 				
 				Hotel hotel = new Hotel();
 				hotel.setId(id);
 				hotel.setImageurl(imgurl);
 				bReader.readLine();
 				hotel.setUrl(bReader.readLine());
 				hotel.setName(bReader.readLine());
 				hotel.setDistrict(bReader.readLine());
 				hotel.setAddress(bReader.readLine());
 				hotel.setScore(Double.parseDouble(bReader.readLine()));
 				hotel.setPaynum(bReader.readLine());
 				hotel.setPrice(Integer.parseInt(bReader.readLine()));
 				bReader.readLine();
 				hotelService.insertHotel(hotel);
 				
 				System.out.println(hotel.getName());
 				id++;
 			}
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
		return "success";
	}
	
	@RequestMapping("/hotels")
	public List<Hotel> getRandomHotels() {
		List<Hotel> hotels = hotelService.getRandomHotels();
		System.out.println("获取数据成功");
		return hotels;
	}
	
}
