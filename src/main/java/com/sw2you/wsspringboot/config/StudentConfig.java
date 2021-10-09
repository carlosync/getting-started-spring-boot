package com.sw2you.wsspringboot.config;

import com.sw2you.wsspringboot.model.Student;
import com.sw2you.wsspringboot.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student carlos = new Student(
                    "Carlos",
                    "carlos@gmail.com",
                    LocalDate.of(1987, Month.AUGUST, 4), 33);

            Student aurelio = new Student(
                    "Aurélio",
                    "aurelio@gmail.com",
                    LocalDate.of(1990, Month.FEBRUARY, 6), 30);

            studentRepository.saveAll(List.of(carlos, aurelio));
        };
    }
}
