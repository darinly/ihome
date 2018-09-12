package com.ihome.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ihome.domain.Food;

public interface FoodMapper {

	@Select("select * from food where price != 0 order by random() limit 8")   //随机获取八条数据
	@Results({
		@Result(property = "id", column = "id", javaType = Integer.class),
		@Result(property = "name", column = "name", javaType = String.class),
		@Result(property = "url", column = "url", javaType = String.class),
		@Result(property = "price", column = "price", javaType = Integer.class),
		@Result(property = "commentNum", column = "commentnum", javaType = Integer.class),
		@Result(property = "category", column = "category", javaType = String.class),
		@Result(property = "address", column = "address", javaType = String.class),
		@Result(property = "scoreTaste", column = "scoretaste", javaType = Double.class),
		@Result(property = "scoreEnvironment", column = "scoreenvironment", javaType = Double.class),
		@Result(property = "scoreService", column = "scoreservice", javaType = Double.class),
		@Result(property = "scoreMerchant", column = "scoremerchant", javaType = String.class),
		@Result(property = "imageUrl", column = "imageurl", javaType = String.class),
	})
	List<Food> getRandomFoods();
	
	@Insert("insert into food (id,name,url,price,commentnum,category,address,scoretaste,scoreenvironment,scoreservice,scoremerchant,imageurl) " +
			"values(#{id},#{name},#{url},#{price},#{commentNum},#{category},#{address},#{scoreTaste},#{scoreEnvironment},#{scoreService},#{scoreMerchant},#{imageUrl})")
	void insertFood(Food food);
	
}
