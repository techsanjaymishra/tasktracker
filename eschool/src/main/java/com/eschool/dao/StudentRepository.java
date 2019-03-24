package com.eschool.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eschool.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
