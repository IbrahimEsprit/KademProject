package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity public class Equipe {
    @Id
    int idEquipe;
    String nomEquipe;

    @ManyToOne
    Niveau niveau;
}
