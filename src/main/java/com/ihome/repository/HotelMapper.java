package com.ihome.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ihome.domain.Hotel;

public interface HotelMapper {
	
	@Select("select * from hotel order by random() limit 8")   //随机获取八条数据
	@Results({
		@Result(property = "id", column = "id", javaType = Integer.class),
		@Result(property = "name", column = "name", javaType = String.class),
		@Result(property = "imageurl", column = "imageurl", javaType = String.class),
		@Result(property = "url", column = "url", javaType = String.class),
		@Result(property = "district", column = "district", javaType = String.class),
		@Result(property = "address", column = "address", javaType = String.class),
		@Result(property = "score", column = "score", javaType = Double.class),
		@Result(property = "price", column = "price", javaType = Integer.class),
		@Result(property = "paynum", column = "paynum", javaType = String.class),
	})
	List<Hotel> getRandomHotels();

	@Insert("insert into hotel (id,name,imageurl,url,district,address,score,price,paynum) " +
			"values(#{id},#{name},#{imageurl},#{url},#{district},#{address},#{score},#{price},#{paynum})")
	void insertHotel(Hotel hotel);
}