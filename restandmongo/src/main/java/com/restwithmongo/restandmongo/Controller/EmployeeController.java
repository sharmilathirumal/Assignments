package com.restwithmongo.restandmongo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restwithmongo.restandmongo.Entity.Employee;
import com.restwithmongo.restandmongo.Service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/view")
    public String getView(){
        return "index";
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return ResponseEntity.ok("Employee Added successfully");
    }

     @PostMapping("/update/{id}")
    public ResponseEntity<?> addEmployee(@PathVariable String id,@RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
        return ResponseEntity.ok("Employee Updated successfully");
    }

     @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee Deleted successfully");
    }

     @GetMapping("/get/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable String id){
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok().body(employee);
    }

     @GetMapping("/getAll")
    public ResponseEntity<?> getAllEmployee(){
       List<Employee> employees= employeeService.getAllEmployees();
        return ResponseEntity.ok().body(employees);
    }
}
