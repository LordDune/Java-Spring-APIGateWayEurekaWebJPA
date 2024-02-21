package ru.ld.Manager.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "managers")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
