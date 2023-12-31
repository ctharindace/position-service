package com.chethiya.position.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="POSITION_T_WORK_GRADE")
public class WorkGrade {

    @Id
    @Column(name="GRADE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSITION_S_WORK_GRADE")
    @SequenceGenerator(sequenceName = "POSITION_S_WORK_GRADE", name="POSITION_S_WORK_GRADE", allocationSize = 1)
    private Integer gradeId;

    @Column(name="GRADE_CODE", unique = true)
    private String gradeCode;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "workGrade")
    private Set<TypeOfWork> typesOfWork;

}
