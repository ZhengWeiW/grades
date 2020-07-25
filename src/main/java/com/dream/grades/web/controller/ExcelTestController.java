package com.dream.grades.web.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dream.grades.entity.StudentScore;
import com.dream.grades.service.ReportService;
import com.dream.grades.mapper.ReportMapper2;
@RestController
@RequestMapping("/report")
public class ExcelTestController {
	private static final Logger log = LoggerFactory.getLogger(ExcelTestController.class);
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private ReportMapper2 ReportMapper2;

	@RequestMapping("/test")
	public void reportTest(@RequestParam HashMap<String, Object> param, HttpServletResponse response) {
		log.info("-------reportTest-------------------");
		List<StudentScore> reportTestHash2 =  reportService.reportTest2(param);
		log.info("------------reportTestHash2-----------------------{}",reportTestHash2);
		List<HashMap<String, Object>> reportTestHash =  reportService.reportTest(param);
		log.info("------------reportTestHash-----------------------{}",reportTestHash);
		for(int i = 0;i<reportTestHash.size();i++) {
			
		}
		
		
	}
	
	@RequestMapping("/test2")
	public void reportTest2(@RequestParam HashMap<String, Object> param, HttpServletResponse response) {
		log.info("-------reportTest2-------------------");
		HashMap<String, Object> param2 = new HashMap<String, Object>();
		List<HashMap<String, Object>> reportTestHash =  reportService.reportTest(param2);
		log.info("------------reportTestHash-----------------------{}",reportTestHash);
		List<StudentScore> reportTestHash2 =  reportService.reportTest2(param);
		log.info("------------reportTestHash2-----------------------{}",reportTestHash2);
		
		for(int i = 0;i<reportTestHash.size();i++) {
			
		}	
	}
	
	@RequestMapping("/test3")
	public void reportTest3(@RequestParam HashMap<String, Object> param, HttpServletResponse response) {
		log.info("-------reportTest2-------------------");
		ReportMapper2.reportTest(param);
	}
}
