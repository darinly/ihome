package com.ihome.repository;

import org.apache.ibatis.annotations.Select;

import com.ihome.domain.TestTable;

public interface TestTableMapper {

	@Select("select * from testtable where testcol1=#{testcol1}")
	TestTable findTestByTestcol1(String testcol1);
	 
}
