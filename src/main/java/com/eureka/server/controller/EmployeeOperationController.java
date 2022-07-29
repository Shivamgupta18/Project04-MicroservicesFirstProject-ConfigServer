package com.eureka.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationController {
	@Value("${dbuser}")
	private String dbusername;
	@Value("${dbpwd}")
	private String dbpassword;

	@GetMapping("/show")
	public ResponseEntity<String> showDbDetails() {
		return new ResponseEntity<>("Emp-> DB Details" + "DB Username" + dbusername + "PAssword of DB" + dbpassword,
				HttpStatus.OK);
	}
}
