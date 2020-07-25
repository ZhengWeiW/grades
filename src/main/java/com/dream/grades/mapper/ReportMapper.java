package com.dream.grades.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dream.grades.entity.StudentScore;

@Repository  //@MapperScan("xxx.xxx.xxx.mapper")
//@Mapper
public interface ReportMapper {
	
	
	List<HashMap<String, Object>> reportTest(HashMap<String, Object> map);
	
	List<StudentScore> reportTest2(HashMap<String, Object> map);

}
