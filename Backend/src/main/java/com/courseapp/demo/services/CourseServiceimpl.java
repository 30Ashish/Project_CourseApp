package com.courseapp.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.demo.controller.entities.Course;
import com.courseapp.demo.dao.CourseDao;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServiceimpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1,"Java Course","This course contain basic java "));
//		list.add(new Course(2,"SQL Course","This course contain basic SQL " ));
		
		
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
