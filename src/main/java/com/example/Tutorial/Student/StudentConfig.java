package com.example.Tutorial.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student Andrei =new Student("Andrei","Gherman@gmail", LocalDate.of(2000, Month.JANUARY,5));
            Student Alex =new Student("Alex","Alex@gmail", LocalDate.of(2004, Month.JANUARY,5));
            repository.saveAll(List.of(Andrei,Alex));
        };

    }

}
