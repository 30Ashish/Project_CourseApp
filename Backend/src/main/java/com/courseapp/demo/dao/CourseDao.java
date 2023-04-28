package com.courseapp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseapp.demo.controller.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {
	 

}
