package com.eschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eschool.domain.Response;
import com.eschool.entity.Student;
import com.eschool.service.StudentService;

import antlr.collections.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value="e-school")

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@ApiOperation(value = "View a list of all student",response = List.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	
	
	@GetMapping("/student")
	public ResponseEntity<Response> getAllStudent(){
	Response response = new Response();
	response.setStatusCode(200);
	response.setStatusMsg("Success");
	response.setData(studentService.getStudentList());
	
	return new ResponseEntity<>(response,HttpStatus.OK);
	
	}
	
	@ApiOperation(value = "Add a product")
	
	@PostMapping("/student")
	public ResponseEntity<Response> saveStudent(@RequestBody(required=true) Student student){
		 
		studentService.saveStudent(student);
		
		Response response =new Response();
		response.setStatusCode(201);
		response.setStatusMsg("Record Created");
		response.setData(null);
		
		return new ResponseEntity<Response>(response,HttpStatus.CREATED);
		
	}
}
