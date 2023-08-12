package com.aka.base.services;

import com.aka.base.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getByFirstName (String name);

    Employee getByLastName (String name);
}
