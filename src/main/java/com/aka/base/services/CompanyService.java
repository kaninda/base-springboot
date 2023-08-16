package com.aka.base.services;

import com.aka.base.models.Company;

import java.util.List;

public interface CompanyService {
    Company getByName (String name);
    List<Company> getAll ();
    void addCompany (Company company);
    void deleteCompany (Long companyId);
}
