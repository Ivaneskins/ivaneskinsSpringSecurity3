package ru.kata.spring.boot_security.demo.dao;



import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserByName(String name);

    User getUser(int id);
}
