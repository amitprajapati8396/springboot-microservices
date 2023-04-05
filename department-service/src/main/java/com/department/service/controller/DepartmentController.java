package com.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.service.entity.Department;
import com.department.service.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
	private DepartmentService service;
	
	@PostMapping("/")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department){
		log.info("inside add department method of department controller! ");
		return new ResponseEntity<>(service.addDepartment(department),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(service.findById(id) , HttpStatus.FOUND);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllDepartments(){
		return new ResponseEntity<>(service.findAllDepartments(), HttpStatus.FOUND);
	}
}
