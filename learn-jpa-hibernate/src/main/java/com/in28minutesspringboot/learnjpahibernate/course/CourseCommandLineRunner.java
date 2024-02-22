package com.in28minutesspringboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.in28minutesspringboot.learnjpahibernate.course.Course;
import com.in28minutesspringboot.learnjpahibernate.course.jdbc.CourseJbdbRepository;
import com.in28minutesspringboot.learnjpahibernate.course.jpa.CourseJpaReposiory;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
    private ApplicationContext applicationContext;
	
//	@Autowired
//	private CourseJbdbRepository repository;
	
//	@Autowired
//	private CourseJpaReposiory repository;
//
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn Aws Jpa","in28minutes"));	
		repository.save(new Course(2,"Learn AZure Now","in28minutes"));	
		repository.save(new Course(3,"Learn GCP","in28minutes"));	
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(1l));
		
//		
//		String[] beanNames = applicationContext.getBeanDefinitionNames();
//        for (String beanName : beanNames) {
//            System.out.println("Bean name: " + beanName);
//        }
		
		
	}

}
