package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, String>, ProductCustomRepo, JpaSpecificationExecutor<Product> {


}
