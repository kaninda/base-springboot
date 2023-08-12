package com.aka.n1problem.services.impl;

import com.aka.n1problem.models.Employee;
import com.aka.n1problem.repositories.EmployeeRepository;
import com.aka.n1problem.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee getByFirstName(String name) {
      return employeeRepository.findByFirstName(name);
    }

    @Override
    public Employee getByLastName(String name) {
        return employeeRepository.findByFirstName(name);
    }
}
