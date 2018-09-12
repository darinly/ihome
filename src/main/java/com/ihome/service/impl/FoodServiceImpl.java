package com.ihome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ihome.domain.Food;
import com.ihome.repository.FoodMapper;
import com.ihome.service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodMapper foodMapper;
	
	@Transactional
	@Override
	public int insertFood(Food food) {
		foodMapper.insertFood(food);
		return food.getId();
	}
	
	@Transactional
	@Override
	public List<Food> getRandomFoods() {
		return foodMapper.getRandomFoods();
	}
}
