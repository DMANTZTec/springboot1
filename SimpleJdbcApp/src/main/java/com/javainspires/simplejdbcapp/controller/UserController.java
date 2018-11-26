package com.javainspires.simplejdbcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainspires.simplejdbcapp.repository.UserRepository;

//make this restController
@RestController
@RequestMapping(path="/user")
public class UserController {
@Autowired
	UserRepository userRepository;
	//to test our service is up and running
	@GetMapping
	public String check() {
		return "Welcome to Java Inspires";
	}
	@GetMapping(path="/getusernames")
	public List<String> getAllUserNames(){
		return userRepository.getAllUserNames();
		
	}
}
