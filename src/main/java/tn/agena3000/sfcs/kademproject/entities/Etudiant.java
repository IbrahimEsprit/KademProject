package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.*;


@Entity
public class Etudiant {
    @Id
    private int IdEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;
}
