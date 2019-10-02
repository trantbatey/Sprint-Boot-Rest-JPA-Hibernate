package com.trantbatey.springbootjpahibernate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootJpaHibernateApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaHibernateApplication.class, args);
    }
}
