package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courserepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courserepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		return courserepository.findOne(id);
		}

	public void addCourse(Course course) {
		courserepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courserepository.save(course);
		
	}

	public void deleteCourse(String id) {
		courserepository.delete(id);
	}

}
