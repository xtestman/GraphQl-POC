package com.cybage.advice;

import com.cybage.exception.StudentNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<String> handleException(StudentNotFound exception){
        return new ResponseEntity<String>("Student Not found", HttpStatus.BAD_REQUEST);
    }

}
