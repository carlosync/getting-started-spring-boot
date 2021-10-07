package com.sw2you.wsspringboot.service;

import com.sw2you.wsspringboot.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Aurélio", "carlosync@gmail.com",
                        LocalDate.of(1987, Month.AUGUST, 4),
                        33)
        );
    }
}
