package com.aka.base.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table (name = "COMPANIES")
public class Company {
    @Id
    private Long id;
    private String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "company" )
    private List<Employee> employees;
}
