package com.yadavtech.UserAuthService.service;

import com.yadavtech.UserAuthService.entity.Department;
import com.yadavtech.UserAuthService.exception.DepartmentNotFoundException;
import com.yadavtech.UserAuthService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

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
    public void deleteDepartmentById(String departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(String departmentId, Department department) {
        Department depDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depDB);
    }

    @Override
    public Department updateDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

    @Override
    public Department updateDepartmentPartially(Department department, String departmentId) {
        Department existingDepartment = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        if (department.getDepartmentName() != null) {
            existingDepartment.setDepartmentName(department.getDepartmentName());
        }

        if (department.getDepartmentAddress() != null) {
            existingDepartment.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(existingDepartment);

    }

    @Override
    public Department fetchDepartmentWithId(String departmentId) throws DepartmentNotFoundException {
        Optional<Department> department =
                departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Available");
        }
        return department.get();
    }

}

