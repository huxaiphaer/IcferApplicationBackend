package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Student;
import com.grokonez.jwtauthentication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import java.util.Optional;

import static java.lang.Math.toIntExact;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/orphan")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    Student create(@RequestBody Student student) throws ValidationException {

        if (student.getFirstName() != null && student.getLastName() != null)
            return studentService.save(student);
        else throw new ValidationException("problem while registering a student");
    }

    @GetMapping("/orphans")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    Iterable<Student> read() {
        return studentService.findAll();
    }

    @PutMapping("/orphan")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    ResponseEntity<Student> update(@RequestBody Student student) {
        if (studentService.findById(toIntExact(student.getID())).isPresent())
            return new ResponseEntity(studentService.save(student), HttpStatus.OK);
        else
            return new ResponseEntity(student, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/orphan/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    void delete(@PathVariable Integer id) {
        studentService.deleteById(id);
    }

    @GetMapping("/student/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    Optional<Student> findById(@PathVariable Integer Id) {
        return studentService.findById(Id);
    }
}
