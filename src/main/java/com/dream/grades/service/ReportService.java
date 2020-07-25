package com.dream.grades.service;

import java.util.HashMap;
import java.util.List;

import com.dream.grades.entity.StudentScore;



public interface ReportService {
	 List<HashMap<String, Object>> reportTest(HashMap<String, Object> map);
	 
	 List<StudentScore> reportTest2(HashMap<String, Object> map);
	

}
