package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

<<<<<<< HEAD
	public Product findById(Long id) {
=======
	public Product findById(String id) {
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
<<<<<<< HEAD
}
=======

//	public List<Product> findByName(String name) {
//		List<Product> obj = repository.findByName(name);
//		return obj;
//	}

//	public List<Order> primeirasConsultas(EntityManager entityManager) {
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//
//		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
//		Root<Product> root = criteriaQuery.from(Product.class);
//		criteriaQuery.select(root);
//
//		TypedQuery<Product> typedQuery = entityManager.createQuery(criteriaQuery);
//		List<Product> list = typedQuery.getResultList();
//		return (List<Order>) criteriaQuery.from(Product.class);
//	}
	}
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
