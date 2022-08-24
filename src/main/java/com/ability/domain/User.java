package com.ability.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", length = 20, nullable = false, unique = true)
    private String userId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    protected User() {
    }

    public User(final Long id,
                final String userId,
                final String email,
                final String name,
                final String password) {
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
