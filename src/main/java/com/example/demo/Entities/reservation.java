package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private long idReservation;
    private Date anneeUniversitaire ;
    private Boolean estValide ;


}
