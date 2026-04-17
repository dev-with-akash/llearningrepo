package com.yadavtech.UserAuthService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private String Id;
    private String DepartmentName;
    private String DepartmentAddress;
    private String Code;

}
