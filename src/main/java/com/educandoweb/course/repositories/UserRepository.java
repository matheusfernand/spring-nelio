 package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;

import java.util.List;
=======
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376

import java.util.List;

<<<<<<< HEAD
=======
public interface UserRepository extends JpaRepository<User, String>, UserCustomRepo, JpaSpecificationExecutor<User> {

>>>>>>> 718b9bf4e1fae8a05420ca44ac9e01ca93ad1376
    List<User> findByName(String name);

    @Query("SELECT u FROM tb_user u WHERE phone = ?1")
    List<User> findByPhone(String phone);
}