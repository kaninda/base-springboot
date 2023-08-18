package com.aka.base.repositories;

import com.aka.base.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository <Company, Long> {
    Company findByName(String name);
    @Query("select case when count(c) > 0 then true else false end from Company c where c.name= ?1")
    Boolean selectExistsName (String name);
}