package com.example.springbootmvc.repository;

import com.example.springbootmvc.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CourseRepository {
    public List<Course> getCourse(){
        List<Course> courseList = new ArrayList<>();
        courseList.add(Course.builder()
                .id("4a89f3ff-ba31-447a-8d03-49e8e523789f")
                .title("FullStack Java")
                .code("ISTAD-001")
                .status(true)
                .price(99.0)
                .build());
        courseList.add(Course.builder()
                .id("4d20fed4-3b8f-4097-9647-c74bd4e57b8a")
                .title("C++ program")
                .code("ISTAD-002")
                .status(true)
                .price(29.0)
                .build());
        courseList.add(Course.builder()
                .id("126fd8a5-22ce-47c3-975f-e31c4233a505")
                .title("Git Hub")
                .code("ISTAD-003")
                .status(false)
                .price(50.0)
                .build());
        courseList.add(Course.builder()
                .id("5751c422-dff9-48d4-9c65-40cb175cd96c")
                .title("Linux")
                .code("ISTAD-004")
                .status(false)
                .price(150.0)
                .build());
        courseList.add(Course.builder()
                .id("83388039-b089-4bf2-b745-62986877d28b")
                .title("JS")
                .code("ISTAD-005")
                .status(true)
                .price(180.0)
                .build());
        return courseList;
    }
}
