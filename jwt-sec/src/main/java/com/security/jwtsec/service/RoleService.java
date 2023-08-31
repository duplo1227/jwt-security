package com.security.jwtsec.service;

import com.security.jwtsec.entities.Role;
import com.security.jwtsec.entities.User;
import com.security.jwtsec.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole(){

        return roleRepository.findByName("ROLE_USER").get();
    }

}
