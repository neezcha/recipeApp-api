package com.recipes;

import java.io.FileInputStream;
import java.io.IOException;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
public class RecipesApplication {

	@Autowired 
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}

}
