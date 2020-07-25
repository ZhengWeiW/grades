package com.dream.grades.service.impl;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.grades.entity.StudentScore;
import com.dream.grades.mapper.ReportMapper;
import com.dream.grades.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	private static final Logger log = LoggerFactory.getLogger(ReportService.class);
	@Autowired
	private ReportMapper reportMapper;
	@Override
	public List<HashMap<String, Object>> reportTest(HashMap<String, Object> map) {
		log.info("--------------------------------------------------");
		return reportMapper.reportTest(map);
	}
	
	@Override
	public List<StudentScore> reportTest2(HashMap<String, Object> map) {
		log.info("------222222222--------------------------------------------");
		return reportMapper.reportTest2(map);
	}
}
