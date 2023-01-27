package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity public class Universite {
    @Id
    int idUniv;
    String nomUniv;

}
