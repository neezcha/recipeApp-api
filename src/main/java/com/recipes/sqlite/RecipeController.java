package com.recipes.sqlite;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/recipes") 
@CrossOrigin(origins = "http://localhost:3000")
public class RecipeController {

    private final RecipeRepository recipeRepo;

    public RecipeController(RecipeRepository recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeRepo.findAll();
    }

    @PostMapping
    public ResponseEntity<Long> createRecipe(@RequestBody Recipe recipe) {
        long id = recipeRepo.save(recipe);
        return new ResponseEntity<Long>(id, HttpStatus.CREATED); // 201
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe recipe) {
        long id = recipeRepo.save(recipe); // not implamented yet
        Recipe updatedRecipe = recipeRepo.findById(id);
        return new ResponseEntity<Recipe>(updatedRecipe, HttpStatus.OK); // 200
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable long id) {
        Recipe recipe = recipeRepo.findById(id);
        if (recipe != null) {
            return ResponseEntity.ok(recipe); // 200
        } else {
            return ResponseEntity.notFound().build(); // 404
        }
    }
}