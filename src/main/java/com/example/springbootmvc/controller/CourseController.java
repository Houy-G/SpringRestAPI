package com.example.springbootmvc.controller;

import com.example.springbootmvc.dto.CourseResponse;
import com.example.springbootmvc.service.CourseServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/web/v1/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseServiceImp service;
    @GetMapping("getAll")
    public List<CourseResponse> getCourse(@RequestParam(required = false,defaultValue = "true") Boolean status){
        return service.getCourses(status);
    }
    @GetMapping("getCourse")
        public List<CourseResponse> getCourses(@RequestParam(required = false,defaultValue = "true") Boolean status,@RequestParam String title){
        return service.getCourses(status,title);
    }

    @GetMapping("code/{code}")
    public CourseResponse getCourseByCode(@PathVariable String code){
        return service.getCourseByCode(code);
    }
    @GetMapping("id/{id}")
    public CourseResponse getCourseById(@PathVariable String id){
        return service.getCourseById(id);
    }
}
