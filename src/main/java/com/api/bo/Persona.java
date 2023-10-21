package com.api.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Persona")
public class Persona {

    @Id
    long id;

    @Column(name = "Nom")
    String nom;
    @Column(name = "Prenom")
    String prenom;
    @Column(name = "Adresse")
    String adresse;
    @Column(name = "NumTel")
    String numTel;
    @Column(name = "Diplome")
    String diplome;
    @Column(name = "IntituleDiplome")
    String intituleDiplome;
}