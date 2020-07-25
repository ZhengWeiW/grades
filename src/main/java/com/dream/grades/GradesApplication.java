package com.dream.grades;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.dream.grades.mapper")
public class GradesApplication {
	public static final Logger logger = LoggerFactory.getLogger(GradesApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(GradesApplication.class, args);
	}

}
