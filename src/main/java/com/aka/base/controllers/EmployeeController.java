package com.aka.base.controllers;

import com.aka.base.models.Employee;
import com.aka.base.services.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(
        name = "EmployeeController",
        value = "/api/v1/employees",
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> employees = employeeService.getAll();
        return ResponseEntity.ok().body(employees);
    }
    @GetMapping("/firstname/{firstname}")
    public ResponseEntity<Employee> getByFirstname (@PathVariable String firstname){
        Employee employee = employeeService.getByFirstName(firstname);
        return ResponseEntity.ok().body(employee);
    }

    @GetMapping("/lastname/{lastname}")
    public ResponseEntity<Employee> getByLastname (@PathVariable String lastname){
        Employee employee = employeeService.getByLastName(lastname);
        return ResponseEntity.ok(employee);
    }
}
