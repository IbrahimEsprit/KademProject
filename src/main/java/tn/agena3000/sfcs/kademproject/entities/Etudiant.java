package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.*;


@Entity
public class Etudiant {
    @Id
    int IdEtudiant;
    String prenomE;
    String nomE;
    Option option;
}
