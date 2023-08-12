package com.aka.base;

import com.aka.base.services.CompanyService;
import jakarta.persistence.EntityManager;

public class CompanyServiceIntegrationTest {

    private final CompanyService companyService;
    private final EntityManager entityManager;

    public CompanyServiceIntegrationTest(CompanyService companyService, EntityManager entityManager) {
        this.companyService = companyService;
        this.entityManager = entityManager;
    }


}
