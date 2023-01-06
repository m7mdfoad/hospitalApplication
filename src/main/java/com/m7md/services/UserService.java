package com.m7md.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m7md.hospitalManager.beans.User;
import com.m7md.repos.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepo;

	@Autowired
	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public User addUser(User user) {
		user.setUserCode(UUID.randomUUID().toString());
		return userRepo.save(user);

	}

	public List<User> findUser() {
		return userRepo.findAll();
	}

	public User findUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub

	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
