package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;

import java.util.List;

public interface UserCustomRepo {

    List<User> findByEmail(String email);
}
