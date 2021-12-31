package com.cybage;

import com.cybage.model.Student;
import com.cybage.repository.StudentRepository;
import com.cybage.resolver.Query;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@WebMvcTest(Query.class)
public class StudentgrapgqlwithpostgresApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private StudentRepository studentRepository;


	@Test
	public void findAllTest() {
		when(studentRepository.findAll()).thenReturn(Stream
				.of(new Student(1L,"sudhir","pune","999999","M"),
				new Student(2L,"ram","mumbai","88880","M")).
				collect(Collectors.toList()));


	}

}
