package com.example.akash.controller;

import com.example.akash.entity.Department;
import com.example.akash.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RestController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment (@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){

        return departmentService.fetchDepartmentList();
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable ("Id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully";
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment (@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/department/name/{name}")
    public Department updateDepartmentName (@PathVariable ("name") String departmentName){
        return departmentService.updateDepartmentName(departmentName);
    }

}
