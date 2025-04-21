package com.example.JPADemo.repo;

import com.example.JPADemo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository//marker interface
public interface StudentRepo extends CrudRepository<Student,Integer> {


}
