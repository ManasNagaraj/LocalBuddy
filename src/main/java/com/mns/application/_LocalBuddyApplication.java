package com.mns.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.mns.*"})
@PropertySource(value = "classpath:${spring.profiles.active}/service.config.properties")
@PropertySource(value = "classpath:${spring.profiles.active}/db.hyb.properties")
@EnableMongoRepositories(basePackages = "com.mns.*")
public class _LocalBuddyApplication {

    public static void main(String[] args) {
        SpringApplication.run(_LocalBuddyApplication.class, args);
    }
}
