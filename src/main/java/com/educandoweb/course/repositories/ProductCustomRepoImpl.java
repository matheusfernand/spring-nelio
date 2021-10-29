package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class ProductCustomRepoImpl implements ProductCustomRepo {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Product> findByName(String name) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();

        Root<Product> product = cq.from(Product.class);

        Predicate NamePredicate = cb.equal(product.get(name), name);

        cq.where(NamePredicate);

        TypedQuery<Product> query = entityManager.createQuery(cq);

        return query.getResultList();
    }
//
//    Predicate getPredicate(Root<Product> root, CriteriaBuilder builder, Product name) {
//        // returns predicate using root, builder and param you need
//        return builder.equal(root.get("name"), name);
//    }
}
