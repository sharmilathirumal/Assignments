package com.restwithmongo.restandmongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restwithmongo.restandmongo.Entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String>{
    
}
