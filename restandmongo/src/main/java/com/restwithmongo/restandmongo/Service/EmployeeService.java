package com.restwithmongo.restandmongo.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restwithmongo.restandmongo.Entity.Employee;
import com.restwithmongo.restandmongo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(String id, Employee updatedEmployee){
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()->new NoSuchElementException("Employee not found"));
       updatedEmployee.setEmployeeId(existingEmployee.getEmployeeId());
       employeeRepository.save(updatedEmployee);
    }

    public void deleteEmployeeById(String id){
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if(existingEmployee.isPresent()){
            employeeRepository.deleteById(id);
        }
        else{
            throw new NoSuchElementException("Employee not found");
        }
    }

    public Employee getEmployeeById(String id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new NoSuchElementException("Employee not found"));
        return employee;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
