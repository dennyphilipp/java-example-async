package com.example.exampleasync.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(length = 100)
    private String name;

    @Column
    private Long age;

    @Column(length = 100)
    private String email;
}
