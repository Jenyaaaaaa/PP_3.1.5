package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
public interface RoleService {

    Role findRoleById(Long id);

    List<Role> getAllRoles();

    void addRole(Role role);
}

