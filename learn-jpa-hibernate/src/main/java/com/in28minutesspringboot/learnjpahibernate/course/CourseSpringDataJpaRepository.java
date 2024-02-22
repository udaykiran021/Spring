package com.in28minutesspringboot.learnjpahibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
}
