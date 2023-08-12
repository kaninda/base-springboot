package com.aka.base.repositories;

import com.aka.base.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Long> {
    Company findByName(String name);
}