package com.eschool.service;

import java.util.List;

import com.eschool.entity.Student;

public interface StudentService {
	
	public List<Student> getStudentList();
	public void saveStudent(Student student);

}
