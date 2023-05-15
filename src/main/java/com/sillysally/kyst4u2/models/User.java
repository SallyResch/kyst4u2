package com.sillysally.kyst4u2.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="kystUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phoneNr;

    public User() {

    }

    public User(String firstname, String lastname, String email, String phoneNr) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNr = phoneNr;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public User setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
        return this;
    }
}
