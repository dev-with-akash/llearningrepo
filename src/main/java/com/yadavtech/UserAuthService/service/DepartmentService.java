package com.yadavtech.UserAuthService.service;

import com.yadavtech.UserAuthService.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    void deleteDepartmentById(String departmentId);

    Department updateDepartment(String departmentId, Department department);

    Department updateDepartmentName(String departmentName);

    Department updateDepartmentPartially(Department department, String departmentId);

    Department fetchDepartmentWithId(String departmentId);
}
