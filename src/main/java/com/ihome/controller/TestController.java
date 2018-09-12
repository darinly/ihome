package com.ihome.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ihome.domain.TestTable;
import com.ihome.service.TestTableService;

@RestController
public class TestController {

	@Resource(name = "testTableService")
	TestTableService testTableService;
	
	@RequestMapping("/test")
	String test(){
		TestTable testTable = testTableService.findTestByTestcol1("1");
		String result = testTable.getTestcol1() + '\t' + testTable.getTestcol2();
		
		return "Result" + result;
	}
	
	@RequestMapping("/getTest")
	public TestTable getTable() {
		TestTable testTable = new TestTable();
		testTable.setTestcol1("wtf");
		testTable.setTestcol2("nfow");
		return testTable;
	}
}
