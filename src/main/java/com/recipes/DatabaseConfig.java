package com.recipes;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration // Tells Spring this class contains bean definitions
public class DatabaseConfig {
    // FROM BEALDUNG
    @Autowired
    Environment env;

    @Bean // The method produces a bean managed by Spring
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // Since you are using SQLite, the properties in application.properties would look something like this:
        // driverClassName=org.sqlite.JDBC
        // url=jdbc:sqlite:./path/to/your/database.db // /Users/neezcha/sqlite/recipes.db
        // dataSource.setDriverClassName(env.getProperty("driverClassName"));
        // dataSource.setUrl(env.getProperty("url"));
        // SQLite typically doesn't use username/password
        // dataSource.setUsername(env.getProperty("user")); 
        // dataSource.setPassword(env.getProperty("password")); 

        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        // Note: For user/password, you might still need to set them to empty strings or 
        // null for SQLite if they are missing in application.properties,
        // or if you want to explicitly use properties like spring.datasource.username.
        dataSource.setUsername(env.getProperty("spring.datasource.username")); 
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

}