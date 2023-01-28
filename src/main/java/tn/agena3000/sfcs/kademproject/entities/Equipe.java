package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity public class Equipe {
    @Id
    private int idEquipe;
    private String nomEquipe;
    private Niveau niveau;
}
