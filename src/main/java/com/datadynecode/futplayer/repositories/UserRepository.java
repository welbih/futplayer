package com.datadynecode.futplayer.repositories;

import com.datadynecode.futplayer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
