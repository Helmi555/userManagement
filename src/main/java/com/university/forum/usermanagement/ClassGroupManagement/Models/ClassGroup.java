package com.university.forum.usermanagement.ClassGroupManagement.Models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.university.forum.usermanagement.MemberManagement.Models.Professor;
import com.university.forum.usermanagement.MemberManagement.Models.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "class_group")
public class ClassGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String reference;

    @OneToMany(mappedBy = "classGroup",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students ;

    @ManyToMany(mappedBy = "classGroups")
    private List<Professor> professors ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "levelOfStudy_id")
    private LevelOfStudy levelOfStudy;
}
