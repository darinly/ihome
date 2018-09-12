package com.ihome;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihome.domain.Hotel;
import com.ihome.service.HotelService;

@Configuration
@SpringBootApplication
@MapperScan("com.ihome.repository")
public class IhomeApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(IhomeApplication.class, args);
		
	}
	
}
