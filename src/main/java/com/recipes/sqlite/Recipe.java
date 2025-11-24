package com.recipes.sqlite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String title;
    private String description; 
    private String ingredients;
    private String steps;

    public Recipe() {}

    public Recipe(String title, String description, String ingredients, String steps) {
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public long getId() {
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getIngredients(){
        return this.ingredients;
    }
    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }
    public String getsteps(){
        return this.steps;
    }
    public void setSteps(String steps){
        this.steps = steps;
    }
    public long save(Recipe recipe){
        this.title = recipe.title;
        this.description = recipe.description;
        this.ingredients = recipe.ingredients;
        this.steps = recipe.steps;
        return this.id;
    }

    public void delette(long id){
        this.id = 0;
    }
}

