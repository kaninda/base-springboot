package com.aka.n1problem.services;

import com.aka.n1problem.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getByFirstName (String name);

    Employee getByLastName (String name);
}
