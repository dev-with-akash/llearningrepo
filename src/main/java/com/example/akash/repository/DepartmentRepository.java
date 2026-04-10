package com.example.akash.repository;

import com.example.akash.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {

    public Department findByDepartmentName (String departmentName);
}
