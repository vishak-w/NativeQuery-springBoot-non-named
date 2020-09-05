package com.example.NativeQueryLatest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NativeQueryLatest.entity.Student;
import com.example.NativeQueryLatest.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping(value = "/getData")
	public List<Student> getData() {
		return service.getAllStudents();
	}

	@RequestMapping(value = "/add")
	public void saveData( @RequestBody Student student) {
		service.saveStudent(student);
	}

}
