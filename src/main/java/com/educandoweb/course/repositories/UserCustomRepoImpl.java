package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class UserCustomRepoImpl implements UserCustomRepo {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> findByEmail(String email) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();

        Root<User> user = cq.from(User.class);

        Predicate NamePredicate = cb.equal(user.get(email), email);

        cq.where(NamePredicate);

        TypedQuery<User> query = entityManager.createQuery(cq);

        return query.getResultList();
    }
//
//    Predicate getPredicate(Root<Product> root, CriteriaBuilder builder, Product name) {
//        // returns predicate using root, builder and param you need
//        return builder.equal(root.get("name"), name);
//    }
}
