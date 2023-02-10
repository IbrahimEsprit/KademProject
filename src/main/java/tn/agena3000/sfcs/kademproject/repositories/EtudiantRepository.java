package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
