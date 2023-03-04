package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;

import java.util.List;


public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    List<Contrat> findByArchive(Boolean Archive);
}
