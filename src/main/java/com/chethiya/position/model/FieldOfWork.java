package com.chethiya.position.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="POSITION_T_FIELD_OF_WORK")
public class FieldOfWork {

    @Id
    @Column(name="FIELD_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSITION_S_FIELD_OF_WORK")
    @SequenceGenerator(sequenceName = "POSITION_S_FIELD_OF_WORK", name="POSITION_S_FIELD_OF_WORK", allocationSize = 1)
    private Integer fieldId;

    @Column(name="FIELD_CODE", unique = true)
    private String fieldCode;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DESCRIPTION")
    private String description;
    
}
