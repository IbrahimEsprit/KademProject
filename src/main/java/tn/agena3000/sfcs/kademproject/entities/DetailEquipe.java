package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity public class DetailEquipe {
    @Id
    int idDetailEquipe;
    int salle;
    String thematique;
}
