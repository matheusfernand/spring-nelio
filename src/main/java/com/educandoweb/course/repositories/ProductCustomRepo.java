package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCustomRepo {

    List<Product> findByName(String name);
}
