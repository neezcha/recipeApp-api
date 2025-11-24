package com.recipes.sqlite;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes") // obj title and 8080/path // data source not affected by either
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {
    List<Recipe> findAll();
    Recipe findById(@Param("id") long id);
    List<Recipe> findByTitle(@Param("title") String title);
    long save(Recipe recipe);
}