package com.example.demo.configs;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.example.demo")
@EnableWebMvc
public class Config implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    @Autowired
    public Config(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @Bean
    public Book firstBook(){
        return new Book("First Book", "Alex", "test_description","1010-1111-5500",50);
    }

    @Bean
    public Book secondBook(){
        return new Book("Second Book", "Tom", "description_test", "2020-55221-1100", 60);
    }

    @Bean
    public Book thirdBook(){
        return new Book("Third Book", "Paul", "test_test_test", "5020-21456-5500", 70);
    }
}