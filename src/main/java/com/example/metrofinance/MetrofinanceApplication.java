package com.example.metrofinance;

import org.springframework.boot.SpringApplication;
import com.example.metrofinance.repository.CommentaryRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MetrofinanceApplication {

	@Autowired
	CommentaryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MetrofinanceApplication.class, args);
	}

}
