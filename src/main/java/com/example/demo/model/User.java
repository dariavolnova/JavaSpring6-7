package com.example.demo.model;

import com.example.demo.model.dao.UserDAO;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
public class User {
    private int id;
    private String username;
    private String password;
    private int age;

    public User(int id, String username, String password, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }
    public User()
    {
        this.id = UserDAO.getUsers_count();
        UserDAO.setUsers_count(UserDAO.getUsers_count()+1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}