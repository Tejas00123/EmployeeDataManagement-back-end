package com.verto.advoiser;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.verto.Exceptions.EmployeeNotFoundException;
import com.verto.entity.ErrorDetails;

@RestControllerAdvice
public class EmployeeErrorHandler {
	
    @ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleEmployeeNotFound(EmployeeNotFoundException enfe){
		ErrorDetails errorDetails = new ErrorDetails(enfe.getMessage(),LocalDateTime.now(),"404-Employee Not found...");
	    return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
