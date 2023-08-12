package com.aka.n1problem.repositories;

import com.aka.n1problem.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Long> {
    Company findByName(String name);
}