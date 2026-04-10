package com.example.akash.entity;

public class Department {

    private Long Id;
    private String DepartmentName;
    private String DepartmentAddress;
    private String Code;

    public Long getId() {
        return Id;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public String getCode() {
        return Code;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Department(Long id, String departmentName, String address, String code) {
        Id = id;
        DepartmentName = departmentName;
        DepartmentAddress = address;
        Code = code;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id='" + Id + '\'' +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", Address='" + DepartmentAddress + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
