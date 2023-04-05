package com.department.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.service.entity.Department;
import com.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
    
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(Department department) {
		log.info("inside add department method of department service class!");
		return departmentRepository.save(department);
	}

	@Override
	public Department findById(Integer id) {
		Optional<Department> findById = departmentRepository.findById(id);
		if(findById.isPresent())
			return findById.get();
		else return null;
	}

	@Override
	public List<Department> findAllDepartments() {
		
		return departmentRepository.findAll();
	}
}
