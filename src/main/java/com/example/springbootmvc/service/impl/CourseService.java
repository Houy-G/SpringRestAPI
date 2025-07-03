package com.example.springbootmvc.service.impl;

import com.example.springbootmvc.dto.CourseResponse;

import java.util.List;

public interface CourseService {

    /**
     * ទាញព័ត៌មានវគ្គសិក្សាទាំងអស់
     * @author Sanom
     * @return List<CourseResponse>
     */
    List<CourseResponse> getCourses(Boolean status);

    List<CourseResponse> getCourses(Boolean status, String title);

    CourseResponse getCourseByCode(String code);

    CourseResponse getCourseById(String id);

}
