package com.aka.n1problem;

import com.aka.n1problem.services.CompanyService;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.stat.Statistics;
import org.junit.jupiter.api.Test;

public class CompanyServiceIntegrationTest {

    private final CompanyService companyService;
    private final EntityManager entityManager;

    public CompanyServiceIntegrationTest(CompanyService companyService, EntityManager entityManager) {
        this.companyService = companyService;
        this.entityManager = entityManager;
    }


}
