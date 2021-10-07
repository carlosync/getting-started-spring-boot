package com.sw2you.wsspringboot;

import com.sw2you.wsspringboot.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class WsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsSpringBootApplication.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Carlos", "carlosync@gmail.com",
                        LocalDate.of(1987, Month.AUGUST, 4),
                        33)
        );
    }

}
