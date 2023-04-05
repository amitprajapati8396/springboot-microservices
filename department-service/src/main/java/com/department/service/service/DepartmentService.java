package com.department.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.department.service.entity.Department;

@Component
public interface DepartmentService {
	
   public Department addDepartment(Department department);
   
   public Department findById(Integer id);
   
   public default List<Department> findAllDepartments(){
	
	   return null;
	
   }
   
}
