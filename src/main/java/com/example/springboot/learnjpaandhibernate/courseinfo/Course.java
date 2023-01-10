package com.example.springboot.learnjpaandhibernate.courseinfo;

//to add course details using this class we need to add this to our CourseJdbcRepository
public class Course {
    private long id;
    private String name;
    private String author;

    public void Course(){

    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
