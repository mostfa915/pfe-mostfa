package com.example.pfev2.entites;

// model/Coproprietaire.java



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Coproprietaire extends Utilisateur {
    private Float soldeCharges;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}