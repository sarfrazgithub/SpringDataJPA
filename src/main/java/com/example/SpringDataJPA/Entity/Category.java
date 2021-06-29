package com.example.SpringDataJPA.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name="recipes_id"),
    inverseJoinColumns =  @JoinColumn(name="category_id"))
    private Set<Recipe> recipes;
}
