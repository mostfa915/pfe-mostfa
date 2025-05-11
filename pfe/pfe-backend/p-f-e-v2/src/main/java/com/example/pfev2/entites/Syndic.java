package com.example.pfev2.entites;

// model/Syndic.java



import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@DiscriminatorValue("SYNDIC")
@Data
public class Syndic extends Utilisateur {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}