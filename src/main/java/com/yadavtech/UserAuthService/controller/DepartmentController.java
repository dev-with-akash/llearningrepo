package com.yadavtech.UserAuthService.controller;

import com.yadavtech.UserAuthService.entity.Department;
import com.yadavtech.UserAuthService.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/department")
    public Department saveDepartment (@RequestBody Department department){
        LOGGER.info("inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("inside fetchDepartment of DepartmentController");

        return departmentService.fetchDepartmentList();
    }

    @DeleteMapping("/department/{Id}")
    public String deleteDepartmentById(@PathVariable ("Id") String departmentId){
        LOGGER.info("inside deleteDepartment of DepartmentController");
        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully";
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment (@PathVariable("id") String departmentId, @RequestBody Department department){
        LOGGER.info("inside updateDepartment of DepartmentController");
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/department/name/{name}")
    public Department updateDepartmentName (@PathVariable ("name") String departmentName){
        LOGGER.info("inside updateDepartmentName of DepartmentController");
        return departmentService.updateDepartmentName(departmentName);
    }

    @PatchMapping("")
    public Department updateDepartmentPartially (@RequestBody String departmentId, Department department){
        return departmentService.updateDepartmentPartially(department, departmentId);
    }

    @GetMapping("/departments/{departmentId}")
    public Department fetchDepartmentWithId (@PathVariable String departmentId){
        return departmentService.fetchDepartmentWithId(departmentId);
    }

}
