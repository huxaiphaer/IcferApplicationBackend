package com.grokonez.jwtauthentication.service;

import com.grokonez.jwtauthentication.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentService extends CrudRepository<Student, Integer> {

    Iterable<Student> findByFirstNameAndLastName(String firstName, String lastName);
    Iterable<Student> findByFirstName(String firstName);
    Iterable<Student> findByLastName(String lastName);
}
