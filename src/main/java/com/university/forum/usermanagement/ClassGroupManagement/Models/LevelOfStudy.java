package com.university.forum.usermanagement.ClassGroupManagement.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LevelOfStudy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "levelOfStudy",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ClassGroup> classGroups;
}
