package com.example.pfev2.entites;




import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    @Enumerated(EnumType.STRING)
    private TypeDocument type;

    @Lob
    private byte[] content;

    @ManyToOne
    private Syndic gestionnaire;

    public enum TypeDocument {
        COMPTE_RENDU, REGLEMENT, BUDGET, AUTRE
    }
}
