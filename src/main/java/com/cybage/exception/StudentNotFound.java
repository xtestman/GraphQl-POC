package com.cybage.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@NoArgsConstructor
public class StudentNotFound extends RuntimeException{

    public StudentNotFound(String msg) {
        super(msg);
    }
}
