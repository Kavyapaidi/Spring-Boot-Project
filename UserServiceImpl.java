package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repo.UserRepo;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@Override
	public String saveUser(User user) {
		userRepo.save(user);
		return "Saved....";
	}

	@Override
	public User getUser(long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public String updateUser(long id, User user) {
		User updatedUser=userRepo.findById(id).get();
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		updatedUser.setGender(user.getGender());
		updatedUser.setDob(user.getDob());
		updatedUser.setContact(user.getContact());
		updatedUser.setAddress(user.getAddress());
		updatedUser.setBloodgroup(user.getBloodgroup());
		updatedUser.setCreatedOn(user.getFirstName());
		updatedUser.setModifiedOn(user.getModifiedOn());
		//update in database
		userRepo.save(updatedUser);
		return "updated...";
	}
	
//	public String deleteUser(long id,User user)
//	{
//		User deleteUser=userRepo.findById(id).get();
//		userRepo.delete(deleteUser);
//		return "Delete user with  the id: "+id;
//}

}
