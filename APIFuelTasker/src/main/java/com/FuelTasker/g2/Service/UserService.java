package com.FuelTasker.g2.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FuelTasker.g2.Entity.UserEntity;
import com.FuelTasker.g2.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository urepo;
	
	//Create
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	//Read
	public List<UserEntity> getAllUsers() {
		return urepo.findAll();
	}
	
	//Update
	@SuppressWarnings("finally")
	public UserEntity updateUser(int userId, UserEntity newUserDetails) {
		UserEntity user = new UserEntity();
		try {
			//Search userId
			user = urepo.findById(userId).get();
			
			//Update the record
			user.setfName(newUserDetails.getfName());
			user.setlName(newUserDetails.getlName());
			user.seteMail(newUserDetails.geteMail());
			user.setpWord(newUserDetails.getpWord());
			
		} catch (NoSuchElementException exc) {
			throw new NoSuchElementException("User " + userId + " does not exist");
		} finally {
			return urepo.save(user);
		}
	}
	
	//Delete
	public String deleteUser(int userId) {
		String msg = "";
		
		if (urepo.findById(userId) != null) {
			msg = "User " + userId + " is successfully deleted!";
		} else {
			msg = "User " + userId + " does not exist!";
		}
		return msg;
	}
} 
