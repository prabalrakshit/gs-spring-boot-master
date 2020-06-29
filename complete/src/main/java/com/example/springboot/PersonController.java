package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class PersonController {

	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@GetMapping("/person/find")
	public ResponseEntity<Person> findPerson() {
		logger.info("This is an info log.");
		logger.error("This is an error log.");
		logger.warn("This is a warn log.");
		logger.debug("This is a debug log.");
		return new ResponseEntity<Person>(new Person(99,"first","last",33), HttpStatus.OK);
	}
}
