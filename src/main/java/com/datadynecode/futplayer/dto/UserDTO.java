package com.datadynecode.futplayer.dto;

import com.datadynecode.futplayer.entities.User;

import java.time.LocalDate;

public class UserDTO {

    private Long id;
    private String name;
    private String nickname;
    private String email;
    private String phone;
    private LocalDate birthDate;

    public UserDTO() {
    }

    public UserDTO(LocalDate birthDate, String phone, String email, String nickname, String name, Long id) {
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
        this.name = name;
        this.id = id;
    }

    public UserDTO(User entity) {
        this.birthDate = entity.getBirthDate();
        this.phone = entity.getPhone();
        this.email = entity.getEmail();
        this.nickname = entity.getNickname();
        this.name = entity.getName();
        this.id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
