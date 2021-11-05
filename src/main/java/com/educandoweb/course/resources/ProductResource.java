package com.educandoweb.course.resources;

import java.util.List;

import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
<<<<<<< HEAD
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
=======

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376

	@RestController
	@RequestMapping(value = "/products")
	public class ProductResource {

		@Autowired
		private ProductService service;

<<<<<<< HEAD
=======
		@Autowired
		private ProductRepository productRepository;

>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
		@GetMapping
		public ResponseEntity<List<Product>> findAll() {
			List<Product> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}

<<<<<<< HEAD
		@GetMapping(value = "/{id}")
		public ResponseEntity<Product> findById(@PathVariable Long id) {
			Product obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
}
=======
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<Product> findById(@PathVariable String id) {
			Product obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}

		@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
		public List<Product> findByName(@PathVariable("name") String name) {
			return productRepository.findByName(name);
		}

//		@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
//		public static findByName(@PathVariable String name, EntityManager entityManager) {
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//
//		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
//		Root<Product> root = criteriaQuery.from(Product.class);
//
//		criteriaQuery.select(root);
//
//		TypedQuery<Product> typedQuery = entityManager.createQuery(criteriaQuery);
//		List<Product> lista = typedQuery.getResultList();
//		return lista.get();
//		}
//		public List<Product> primeirasConsultas(@RequestParam EntityManager entityManager, String name) {
//			TypedQuery query = (TypedQuery) entityManager.createQuery(name);
//			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//
//			CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
//			Root<Product> root = criteriaQuery.from(Product.class);
//			criteriaQuery.select(root);
//
//			TypedQuery<Product> typedQuery = entityManager.createQuery(criteriaQuery);
//			List<Product> results = query.getResultList();
//			return results;
//		}
		}
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
