package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.model.User;
import com.app.service.UserService;


@RestController
public class UserController {


//redirects to register.html page when we hit "/"
//	@GetMapping(value="/")
//	public String overview()
//{		
//		return "register";
//}
	
// "/login page"
//	@PostMapping(value="/login")
//	public String userRegister(@ModelAttribute User user)
//{
//		return "login";
//}

//	@GetMapping(value="/")
//	public String overview()
//	{		
//		return "welcome";
//	}

	@Autowired
	private UserService userService;
	
	//Get all users
	@GetMapping(value="/users")
	public List<User> getUsers()
	{
		return userService.getUsers();
	}
	
//save users into database
	@PostMapping(value="/save")
	public String saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
//get user details based on id
	@GetMapping(value="/users/{id}")
	public User getUser(@PathVariable long id)
	{
		return userService.getUser(id);
		
	}
	
	//update user details based on id
	@PutMapping(value="/update/{id}")
	public String updateUser(@PathVariable long id,@RequestBody User user)
	{
		return userService.updateUser(id, user);
	}
	
//	@DeleteMapping(value="/delete/{id}")
//	public String deleteUser(@PathVariable long id,@RequestBody User user)
//	{
//		
//		return userService.deleteUser(id,user);
//}
	

}