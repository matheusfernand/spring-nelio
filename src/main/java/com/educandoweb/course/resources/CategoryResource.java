package com.educandoweb.course.resources;

import java.util.List;

import com.educandoweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class 	CategoryResource {

	@Autowired 
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/categoryName/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> findByCategoryName(@PathVariable String name) {
		List<Category> obj = service.findByCategoryName(name);
		return ResponseEntity.ok().body(obj);
	}
}
