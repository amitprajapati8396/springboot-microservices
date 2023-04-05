package com.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
    @GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod(){
		return "User service taking langer than expected! please try again";
	}
    
    @GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod(){
		return "Department service taking langer than expected! please try again";
	}
}
