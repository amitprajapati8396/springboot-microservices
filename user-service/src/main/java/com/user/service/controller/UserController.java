package com.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entity.User;
import com.user.service.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    
	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		log.info("inside save user method of user controlller!");
		return new ResponseEntity<>(service.saveUser(user),HttpStatus.CREATED);
	}

    @GetMapping("/{userId}")
    public ResponseEntity<?> reponseTemplate(@PathVariable("userId") Long userId){
    	return new ResponseEntity<>(service.getResponseTemplate(userId),HttpStatus.FOUND);
    }    
}
