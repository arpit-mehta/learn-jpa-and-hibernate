package com.example.springboot.learnjpaandhibernate.course.jdbc;

import com.example.springboot.learnjpaandhibernate.courseinfo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn Spring!!","Arpit Mehta"));
        repository.insert(new Course(2,"Learn SpringBoot!!","Arpit Mehta"));
        repository.insert(new Course(3,"Learn SpringJDBC!!","Arpit Mehta"));
        repository.deleteById(2);
    }
}
