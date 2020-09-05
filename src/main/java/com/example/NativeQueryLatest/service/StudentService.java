package com.example.NativeQueryLatest.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.NativeQueryLatest.entity.Student;
import com.example.NativeQueryLatest.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@org.springframework.transaction.annotation.Transactional
public class StudentService  {

	@PersistenceContext
	EntityManager manager;
	@Autowired
	StudentRepo repo;

	public List<Student> getAllStudents() {
		ModelMapper mapper = new ModelMapper();
		//List<Student> list = manager.createNamedQuery("getAllStudents", Student.class).getResultList();
		//mapper.map(Student.class, StudentDto.class);
		//List<StudentDto> sdDto = Arrays.asList(mapper.map(list, StudentDto[].class));
		//log.info("This details from StudentDto"+sdDto);
		List<Student> list=repo.getAllStudents();
		return list;
	}
	public void saveStudent(Student student) {
		repo.save(student);
	}

}
