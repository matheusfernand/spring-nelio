package com.educandoweb.course.resources;

import java.net.URI;
import java.util.List;

import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable String id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

<<<<<<< HEAD
	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
=======
	@GetMapping("/name/{name}")
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
	public ResponseEntity<List<User>> findByName(@PathVariable String name) {
		List<User> obj = service.findByName(name);
		return ResponseEntity.ok().body(obj);
	}

<<<<<<< HEAD
	@RequestMapping(value = "/phone/{phone}", method = RequestMethod.GET)
=======
	@GetMapping("/phone/{phone}")
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
	public ResponseEntity<List<User>> findByPhone(@PathVariable String phone) {
		List<User> obj = service.findByPhone(phone);
		return ResponseEntity.ok().body(obj);
	}

<<<<<<< HEAD
=======
	@RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
	public List<User> findByEmail(@PathVariable("email") String email) {
		return userRepository.findByEmail(email);
	}

>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable String id, @RequestBody User obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}