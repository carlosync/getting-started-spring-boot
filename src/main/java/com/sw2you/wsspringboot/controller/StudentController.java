package com.sw2you.wsspringboot.controller;

import com.sw2you.wsspringboot.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Aurélio", "carlosync@gmail.com",
                        LocalDate.of(1987, Month.AUGUST, 4),
                        33)
        );
    }

}
