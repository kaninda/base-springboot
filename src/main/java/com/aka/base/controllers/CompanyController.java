package com.aka.base.controllers;

import com.aka.base.models.Company;
import com.aka.base.services.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(
        name = "CompanyController",
        value = "/api/v1/company",
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAll (){
        List<Company> companies = companyService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(companies);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Company> getByName (@PathVariable String name){
        Company company = companyService.getByName(name);
        return ResponseEntity.status(HttpStatus.OK).body(company);
    }
}
