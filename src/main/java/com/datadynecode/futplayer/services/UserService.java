package com.datadynecode.futplayer.services;

import com.datadynecode.futplayer.dto.UserDTO;
import com.datadynecode.futplayer.entities.User;
import com.datadynecode.futplayer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> result = repository.findById(id);
        User user = result.get();
        UserDTO dto = new UserDTO(user);
        return dto;
    }
}
