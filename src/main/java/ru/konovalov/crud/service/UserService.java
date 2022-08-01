package ru.konovalov.crud.service;

import ru.konovalov.crud.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
