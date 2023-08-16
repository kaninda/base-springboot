package com.aka.base.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table (name = "COMPANIES")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {
    @Id
    private Long id;
    private String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "company" )
    private List<Employee> employees;
}
