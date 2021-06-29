package com.example.SpringDataJPA.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "UOM")
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String description;
}
