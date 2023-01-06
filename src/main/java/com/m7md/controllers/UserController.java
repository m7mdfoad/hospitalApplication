package com.m7md.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m7md.hospitalManager.beans.User;
import com.m7md.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> Users = userService.findUser();
		return new ResponseEntity<>(Users, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User User = userService.findUserById(id);
		return new ResponseEntity<>(User, HttpStatus.OK);

	}

	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User User) {
		User newUser = userService.addUser(User);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

//	@PutMapping("/update")
//	public ResponseEntity<User> updateUser(@RequestBody User User) {
//		User updateUser = userService.updateUser(User);
//		return new ResponseEntity<User>(updateUser, HttpStatus.OK);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
//		userService.deleteUser(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
}
