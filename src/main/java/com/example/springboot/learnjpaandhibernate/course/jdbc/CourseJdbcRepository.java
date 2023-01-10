package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//this repo talks to our Course table

@Repository //means this class talks to the database
public class CourseJdbcRepository {

    //using Spring JDBC we fire query
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY=
            """
                    insert into course (id, name, author)
                    values(1, 'Learn Spring' , 'Arpit Mehta');
                    
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }


}
