package com.example.demo.Entities;


import jakarta.persistence.*;

@Entity
public class universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private long idUniversite;
    private String nomUniversite;
    private String addresse;


}
