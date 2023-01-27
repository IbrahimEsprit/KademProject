package tn.agena3000.sfcs.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum Niveau {
 JUNIOR,
    Senior,
    EXPERT;

 @Id
    private int id;
}
