package tn.agena3000.sfcs.kademproject.entities;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmCompositeKeyBasicAttributeType;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private int montantContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    private boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
}
