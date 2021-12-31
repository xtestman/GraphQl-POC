package com.cybage.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.cybage.exception.StudentNotFound;
import com.cybage.model.Student;
import com.cybage.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver
{
    private final StudentRepository studentRepository;

    public Student addStudent(Student stu){
        Student student = Student.builder().name("ram").build();
        var build = Student.builder().name(stu.getName()).build();
        log.info("inside addstudent of Mutation");
        return  studentRepository.save(stu);

    }

    @SneakyThrows
    public Student updateStudent(Long id, String newName) {
        log.info("inside updatestudent of mutation");
        Student student  = studentRepository.findById(id)
                .orElseThrow(()->new StudentNotFound("Student not found for this id "+id));
        student.setName(newName);
       return student;
    }

}
