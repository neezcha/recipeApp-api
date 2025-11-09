package com.recipes.sqlite;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes")
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {
    List<Recipe> findByTitle(@Param("title") String title);
    Recipe save(Recipe recipe);
}