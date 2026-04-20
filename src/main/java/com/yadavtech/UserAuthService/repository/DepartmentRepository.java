package com.yadavtech.UserAuthService.repository;

import com.yadavtech.UserAuthService.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

    public Department findByDepartmentName (String departmentName);
}
