package com.example.springbootmvc.service;

import com.example.springbootmvc.domain.Course;
import com.example.springbootmvc.dto.CourseResponse;
import com.example.springbootmvc.repository.CourseRepository;
import com.example.springbootmvc.service.impl.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseServiceImp implements CourseService {
    private final CourseRepository courseRepository;
    @Override
    public List<CourseResponse> getCourses(Boolean status) {
        List<CourseResponse> filter =courseRepository.getCourse().
                stream()
                .filter(e->e.getStatus().equals(status))
                .map(e-> CourseResponse.builder()
                        .id(e.getId())
                        .code(e.getCode())
                        .price(e.getPrice())
                        .status(e.getStatus())
                        .title(e.getTitle())
                        .build())
                .toList();
        return filter;
    }

    @Override
    public List<CourseResponse> getCourses(Boolean status, String title) {
        List<CourseResponse> filter = courseRepository.getCourse().stream()
                .filter(e->e.getStatus().equals(status)&& e.getTitle().trim().toLowerCase().contains(title.trim().toLowerCase()))
                .map(e->CourseResponse
                        .builder()
                        .id(e.getId())
                        .status(e.getStatus())
                        .price(e.getPrice())
                        .code(e.getCode())
                        .title(e.getTitle())
                        .build()).toList();
        return filter;
    }

    @Override
    public CourseResponse getCourseByCode(String code) {
        Course course = courseRepository.getCourse().stream().filter(e->e.getCode().equals(code)).toList().getFirst();
        return CourseResponse.builder()
                .id(course.getId())
                .title(course.getTitle())
                .code(course.getCode())
                .price(course.getPrice())
                .status(course.getStatus())
                .build();
    }

    @Override
    public CourseResponse getCourseById(String id) {
        Course course = courseRepository.getCourse().stream().filter(e->e.getId().equals(id)).toList().getFirst();
        return CourseResponse.builder()
                .id(course.getId())
                .title(course.getTitle())
                .code(course.getCode())
                .price(course.getPrice())
                .status(course.getStatus())
                .build();
    }
}
