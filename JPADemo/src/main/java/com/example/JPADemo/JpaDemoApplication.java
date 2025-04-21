package com.example.JPADemo;

import com.example.JPADemo.entity.Student;
import com.example.JPADemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);
	}

}
