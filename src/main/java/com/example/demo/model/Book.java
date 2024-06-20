package com.example.demo.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {
    private String name;
    private String author;
    private String description;
    private String ISBN;
    private int countPages;

    public Book(@Value("Test book") String name,
                @Value("Alex") String author,
                @Value("this is first project spring") String description,
                @Value("11155553333") String ISBN,
                @Value("10") int countPages) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.ISBN = ISBN;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}