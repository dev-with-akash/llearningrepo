package com.example.akash.service;

import com.example.akash.entity.Department;
import com.example.akash.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())  &&
        !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

            if(Objects.nonNull(department.getDepartmentAddress()) &&
            !"".equalsIgnoreCase(department.getDepartmentAddress())){
                depDB.setDepartmentAddress(department.getDepartmentAddress());
            }
            return departmentRepository.save(depDB);
        }

    @Override
    public Department updateDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }


}
