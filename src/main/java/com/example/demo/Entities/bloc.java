package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
public class bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;



}
