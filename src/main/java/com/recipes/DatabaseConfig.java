package com.recipes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration // Tells Spring this class contains bean definitions
public class DatabaseConfig {

    @Autowired
    Environment env;

    @Bean // The method produces a bean managed by Spring
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // Since you are using SQLite, the properties in application.properties would look something like this:
        // driverClassName=org.sqlite.JDBC
        // url=jdbc:sqlite:./path/to/your/database.db
        
        dataSource.setDriverClassName(env.getProperty("driverClassName"));
        dataSource.setUrl(env.getProperty("url"));
        // SQLite typically doesn't use username/password
        dataSource.setUsername(env.getProperty("user")); 
        dataSource.setPassword(env.getProperty("password")); 
        return dataSource;
    }
}