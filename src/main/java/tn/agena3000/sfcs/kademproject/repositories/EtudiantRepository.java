package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    // x = nomE et y = prenomE .. in parameters you don't need to use specific attributes.
    // The attributes needs to start with a capital letter
    Etudiant findByNomEAndPrenomE(String x,String y);

}
