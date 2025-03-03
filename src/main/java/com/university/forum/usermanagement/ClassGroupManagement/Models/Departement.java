package com.university.forum.usermanagement.ClassGroupManagement.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String reference;

    @OneToMany(mappedBy = "departement",orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Branch> branches=new ArrayList<>();

}
