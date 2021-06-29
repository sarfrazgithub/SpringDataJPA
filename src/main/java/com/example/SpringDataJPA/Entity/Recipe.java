package com.example.SpringDataJPA.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private String source;
    private String url;
    private String directions;

    @Lob
    private byte[] image;

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;
    @OneToOne( cascade = CascadeType.ALL)
    private Notes notes;

    @Enumerated( EnumType.STRING)
    private Difficulty difficulty;

    @ManyToMany
    @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name="recipes_id"))
    private Set<Category> category;

}
