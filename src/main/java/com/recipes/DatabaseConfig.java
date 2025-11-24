package com.recipes;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class DatabaseConfig {

    @Autowired
    Environment env;

    @Bean // The method produces a bean managed by Spring
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        /**** application.properties ****
        * driverClassName=org.sqlite.JDBC
        * url=jdbc:sqlite:./path/to/your/database.db // /Users/neezcha/sqlite/recipes.db
        ***** SQLite typically doesn't use username/password *****
        * For user/password, you might still need to set them to empty strings or 
        * null for SQLite if they are missing in application.properties,
        * or if you want to explicitly use properties like spring.datasource.username.
        ****/

        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username")); 
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

}