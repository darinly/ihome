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

import com.ihome.domain.Food;
import com.ihome.service.FoodService;

@CrossOrigin("http://localhost:3000")
@RestController
public class FoodController {
	
	@Resource(name = "foodService")
	FoodService foodService;
	
	@RequestMapping("/insertFood")
	public String insertFood() {
		try {
			FileInputStream fStream = new FileInputStream(new File("D:\\hotels\\food.txt"));
			InputStreamReader iReader = new InputStreamReader(fStream,"gbk");
			BufferedReader bReader = new BufferedReader(iReader);
			
			String line = "";
			int id = 1;
			
			while((line = bReader.readLine())!=null){
				String[] resultsList = line.split("\t");
				/*
				System.out.println(id);
				System.out.println(resultsList[0]);
				System.out.println(resultsList[1]);
				System.out.println(resultsList[2]);
				System.out.println(resultsList[3]);
				System.out.println(resultsList[4]);
				System.out.println(resultsList[5]);
				System.out.println(resultsList[6]);
				System.out.println(resultsList[7]);
				System.out.println(resultsList[8]);
				System.out.println(resultsList[9]);
				System.out.println(resultsList[10]);
				*/
				
				Food food = new Food();
				food.setId(id);
				food.setUrl(resultsList[0]);
				food.setName(resultsList[1]);
				food.setCommentNum(Integer.parseInt(resultsList[2]));
				if(resultsList[3]==null || resultsList[3].trim().length() == 0){
					resultsList[3] = "0";
					System.out.println("null");
				}
				food.setPrice(Integer.parseInt(resultsList[3]));
				food.setCategory(resultsList[4]);
				food.setAddress(resultsList[5]);
				food.setScoreTaste(Double.parseDouble(resultsList[6]));
				food.setScoreEnvironment(Double.parseDouble(resultsList[7]));
				food.setScoreService(Double.parseDouble(resultsList[8]));
				food.setScoreMerchant(resultsList[9]);
				food.setImageUrl(resultsList[10]);
				foodService.insertFood(food);
				
				
				id++;
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	@RequestMapping("/foods")
	public List<Food> getRandomFoods() {
		List<Food> foods = foodService.getRandomFoods();
		System.out.println("获取数据成功");
		return foods;
	}
}
