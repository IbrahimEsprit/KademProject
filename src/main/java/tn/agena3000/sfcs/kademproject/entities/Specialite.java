package tn.agena3000.sfcs.kademproject.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum Specialite {
    IA,
    RESEAUX,
            CLOUD,
    SECURITE;
    @Id
    private int id;
}
