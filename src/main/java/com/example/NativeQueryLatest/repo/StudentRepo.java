package com.example.NativeQueryLatest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.example.NativeQueryLatest.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	
	@Query(value="SELECT id,name,age FROM Student",nativeQuery = true)
	List<Student> getAllStudents();
	
	
	
	

}
