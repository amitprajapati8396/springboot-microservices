package com.user.service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.user.service.beans.Department;
import com.user.service.beans.ResponseTemplate;
import com.user.service.entity.User;
import com.user.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
   
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient eurekaClient;
	
	
	@Override
	public User saveUser(User user) {
	
		return repo.save(user);
	}

	@Override
	public ResponseTemplate getResponseTemplate(Long userId) {
		
//		 
//		 Application application = eurekaClient.getApplication("USER-SERVICE");
//		 InstanceInfo instanceInfo = application.getInstances().get(0);
//		
		 
		
		ResponseTemplate temp = new ResponseTemplate();
		Optional<User> findById = repo.findById(userId);
		User user = null;
		if(findById.isPresent())
			user = findById.get();
		
//		 String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" 
//             	 + "department/getById/"+user.getDepartmentId();
//		 
		
		
		//Department department = restTemplate.getForObject("http://localhost:9292/department/getById/"+user.getDepartmentId() , Department.class );

		Department department = restTemplate.getForObject
			("http://DEPARTMENT-SERVICE/department/"+ user.getDepartmentId(), Department.class );
		

		
		temp.setDepartment(department);
		temp.setUser(user);
		
		return temp;
	}
}
