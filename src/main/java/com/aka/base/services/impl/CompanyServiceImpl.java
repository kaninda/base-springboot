package com.aka.base.services.impl;

import com.aka.base.models.Company;
import com.aka.base.repositories.CompanyRepository;
import com.aka.base.services.CompanyService;
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

    @Override
    public void addCompany(Company company) {
        Boolean existingName = companyRepository.selectExistsName(company.getName());
        if(existingName){
          throw new RuntimeException("Name "+company.getName()+ " taken");
        }
        companyRepository.save(company);
    }
    @Override
    public void deleteCompany(Long companyId) {
        if(!companyRepository.existsById(companyId)){
            throw new RuntimeException("Company with "+ companyId + "does not exists");
        }
        companyRepository.deleteById(companyId);
    }
}
