package main.java.com.juniordevelopers.recursos.humanos.repository;

import main.java.com.juniordevelopers.recursos.humanos.model.User;

public class UserRepository {

    User findByCorreo(String correo);

    boolean save(User user);

    boolean existsByCorreo(String correo);

    String findRoleNameByIdRole(int idRole);
}
