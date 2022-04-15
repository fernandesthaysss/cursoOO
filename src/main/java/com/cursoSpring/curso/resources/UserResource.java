package com.cursoSpring.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursoSpring.curso.entities.User;


@RequestMapping(value = "/users")
@RestController
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Thays", "thaysfernandes.ti@gmail.com", "81162992", "81162992");
		return ResponseEntity.ok().body(u);
		
	}

}
