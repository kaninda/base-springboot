package com.aka.n1problem.services;

import com.aka.n1problem.models.Company;

import java.util.List;

public interface CompanyService {
    Company getByName (String name);
    List<Company> getAll ();

}
