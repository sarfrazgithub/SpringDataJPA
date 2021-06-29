package com.example.SpringDataJPA.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "INGREDIENT")
public class Ingredient {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String ingredientName;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne (fetch = FetchType.EAGER)
    private UnitOfMeasure uom;
}
