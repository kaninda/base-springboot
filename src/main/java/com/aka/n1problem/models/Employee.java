package com.aka.n1problem.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    private Long id;
    @Column(name ="firstname")
    private String firstName;
    @Column(name ="lastname")
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "fk_company")
    @JsonBackReference
    private Company company;
}
