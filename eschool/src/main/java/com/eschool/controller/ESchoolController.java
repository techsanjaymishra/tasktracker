package com.eschool.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eschool.domain.Response;

import io.swagger.annotations.Api;

@Api(value="e-school test api")
@RestController
public class ESchoolController {
	
	@GetMapping(value="/test")
	public ResponseEntity<Response> test(){
		
		Response response= new Response();
		response.setStatusCode(200);
		response.setStatusMsg("Success");
		response.setData(null);
		return new ResponseEntity<Response>(response,HttpStatus.OK);

}
}