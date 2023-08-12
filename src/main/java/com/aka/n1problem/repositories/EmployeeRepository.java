package com.aka.n1problem.repositories;

import com.aka.n1problem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByLastName (String name);
    Employee findByFirstName (String name);
}
