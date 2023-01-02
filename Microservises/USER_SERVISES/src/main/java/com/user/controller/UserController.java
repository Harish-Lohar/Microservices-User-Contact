package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.Users;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public Users getUser(@PathVariable("userId") Long userId) {
		Users users = this.userService.getUsers(userId);

		List list = this.restTemplate.getForObject("http://contact-services/contact/user/" + users.getUserId(),List.class);
		users.setContacts(list);
		return users;
	}

}
