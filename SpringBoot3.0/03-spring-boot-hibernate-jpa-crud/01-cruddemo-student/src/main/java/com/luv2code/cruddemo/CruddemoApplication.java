package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);

//			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);

//			queryForstudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudents(studentDAO);


		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		int numRowDeleted = studentDAO.deleteAll();

	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;

		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId = 1;

		Student myStudent = studentDAO.findById(studentId);

		myStudent.setFirstName("Scooby");
		studentDAO.update(myStudent);

		System.out.println(myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("DUCK");

		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForstudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();

		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();

		Student myStudent = studentDAO.findById(theId);

		System.out.println(myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Paul", "Doe", "paul@luv2code.com");
		Student tempStudent3 = new Student("Paul", "Doe", "paul@luv2code.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		System.out.println(tempStudent.getId());
	}
}
