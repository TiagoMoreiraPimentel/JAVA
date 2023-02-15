package com.projetoSpring.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.userdept.entities.User;
import com.projetoSpring.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	// injeção de dependencia
	@Autowired
	private UserRepository repository;

	// ir no banco de dados e buscar todos os usuarios
	@GetMapping
	public List<User> findALL() {
		List<User> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}

}
