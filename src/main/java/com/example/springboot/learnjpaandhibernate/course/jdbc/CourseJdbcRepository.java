package com.example.springboot.learnjpaandhibernate.course.jdbc;

import com.example.springboot.learnjpaandhibernate.courseinfo.Course;
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
                    values(?, ? , ?);
                    
            """;
    private static String DELETE_QUERY=
            """
                    delete from course where id=?;
                    
            """;

    public void insert(Course course){

        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }


}
