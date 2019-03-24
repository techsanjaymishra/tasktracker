package com.eschool.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eschool.dao.StudentRepository;
import com.eschool.entity.Student;
import com.eschool.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	
	public List<Student> getStudentList() {
		List<Student> studentList =new ArrayList<Student>();
		Iterable<Student> students= studentRepository.findAll();
		for(Student student : students) {
			studentList.add(student);      
		}
		return studentList;
	}
	
	
	@Override
	public void saveStudent(Student student) {

		student.setRegistrationDate(new Date().getTime());
		studentRepository.save(student);
		
	}

}
