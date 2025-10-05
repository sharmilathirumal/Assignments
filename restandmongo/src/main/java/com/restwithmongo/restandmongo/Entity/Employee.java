package com.restwithmongo.restandmongo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeLocation;
}
