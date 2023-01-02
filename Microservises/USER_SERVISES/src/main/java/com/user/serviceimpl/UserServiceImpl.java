package com.user.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.Users;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	List<Users> list = List.of(
			new Users(1001L," Harish Lohar","9657041240"), 
			new Users(1002L," Omkar Kharate ","8798797893"), 
			new Users(1003L," Sandip Jadhav ","88768568768")
			);
	
	@Override
	public Users getUsers(Long id) {
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null) ;
		
	}
	
}
