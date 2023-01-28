package tn.agena3000.sfcs.kademproject.entities;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmCompositeKeyBasicAttributeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;
import java.awt.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
public class Contrat {
    @Id
    int idContrat;
    int montantContrat;
    LocalDate dateDebutContrat;
    LocalDate dateFinContrat;
    boolean archive;
    private Specialite specialite;
}
