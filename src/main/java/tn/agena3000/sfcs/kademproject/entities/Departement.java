package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity public class Departement {
    @Id
    int idDepart;
    String nomDepart;
}
