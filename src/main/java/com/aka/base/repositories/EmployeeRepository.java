package com.aka.base.repositories;

import com.aka.base.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByLastName (String name);
    Employee findByFirstName (String name);
}
