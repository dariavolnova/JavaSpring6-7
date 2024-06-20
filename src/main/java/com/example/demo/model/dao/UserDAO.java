package com.example.demo.model.dao;

import com.example.demo.model.User;
import org.springframework.ui.Model;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDAO {
    private static int users_count;
    private static List<User> users;
    public UserDAO()
    {
        String[] names = {"AlexWord", "TestSuite", "TestCase", "SashaWhite", "Jon Smith"};
        String[] pass = {"123", "Goodness", "God", "Pass", "Evil"};
        Integer[] ages = {20, 15, 21, 30, 41};
        users = new ArrayList<>(users_count);
        for (int user_count = 0; user_count < 5; user_count++)
            users.add(users_count, new User(users_count+1, names[user_count], pass[user_count], ages[user_count]));
    }

    public static int getUsers_count() {
        return users_count;
    }

    public static void setUsers_count(int users_count) {
        UserDAO.users_count = users_count;
    }

    public List<User> index() {
        return users;
    }

    public User show(int id){
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }


    public static void save(User user) {
        user.setId(++users_count);
        users.add(user);
    }
    public void update(int id, User user){
        User tmp = show(id);
        tmp.setUsername(user.getUsername());
        tmp.setPassword(user.getPassword());
        tmp.setAge(user.getAge());
    }

    public void delete(int id){
        users.remove(id);
    }
}