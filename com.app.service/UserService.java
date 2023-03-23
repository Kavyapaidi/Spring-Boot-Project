package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.User;

@Service
public interface UserService {

	public List<User> getUsers();
	public String saveUser(@RequestBody User user);
	public User getUser(@PathVariable long id);
	public String updateUser(@PathVariable long id,@RequestBody User user);
//	public String deleteUser(@PathVariable long id,@RequestBody User user);
}
