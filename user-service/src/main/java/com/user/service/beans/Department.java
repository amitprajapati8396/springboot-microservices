package com.user.service.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    
	private Integer departmentId;
	
	private String departmentName;
	
	private String departmentAddress;
	
	private String departmentCode;
}
