package com.aka.n1problem.services.impl;

import com.aka.n1problem.models.Company;
import com.aka.n1problem.repositories.CompanyRepository;
import com.aka.n1problem.services.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public Company getByName(String name) {
        return companyRepository.findByName(name);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

}
