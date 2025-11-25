package ru.yandex.practicum.catsgram.model;

import java.time.Instant;
import lombok.Data;


@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Instant registrationDate;

    public User() {

    }

    public User(Long id, String username, String email, String password, Instant registrationDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public User(Instant registrationDate, String password, String email, String username) {
        this.registrationDate = registrationDate;
        this.password = password;
        this.email = email;
        this.username = username;
    }
}