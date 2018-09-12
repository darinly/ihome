package com.ihome.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ihome.domain.TestTable;
import com.ihome.repository.TestTableMapper;
import com.ihome.service.TestTableService;

@Service("testTableService")
public class TestTableServiceImpl implements TestTableService {

	@Autowired
	private TestTableMapper testTableMapper;
	
	@Transactional(readOnly = true)
	@Override
	public TestTable findTestByTestcol1(String testcol1){
		return testTableMapper.findTestByTestcol1(testcol1);
	}
	
}
