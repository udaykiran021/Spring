package com.in28minutesspringboot.learnjpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutesspringboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaReposiory {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
}
