package com.cybage.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.cybage.model.Student;
import com.cybage.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final StudentRepository studentRepository;


    public List<Student> findAll() {
        log.info("inside findAll method of Query");
        return studentRepository.findAll();
    }

}
