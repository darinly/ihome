package com.ihome.service;

import java.util.List;

import com.ihome.domain.Food;

public interface FoodService {

	int insertFood(Food food);
	
	List<Food> getRandomFoods();
}
