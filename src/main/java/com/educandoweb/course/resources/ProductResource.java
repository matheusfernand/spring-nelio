package com.educandoweb.course.resources;

import java.net.URI;
import java.util.List;

import com.educandoweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

	@RestController
	@RequestMapping(value = "/products")
	public class ProductResource {

		@Autowired
		private ProductService service;

		@GetMapping
		public ResponseEntity<List<Product>> findAll() {
			List<Product> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Product> findById(@PathVariable Long id) {
			Product obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
}
