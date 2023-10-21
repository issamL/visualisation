package com.api.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue
    long id;

    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;
    @Column(name = "adresse")
    String adresse;
    @Column(name = "numTel")
    String numTel;
    @Column(name = "diplome")
    String diplome;
    @Column(name = "intituleDiplome")
    String intituleDiplome;
}