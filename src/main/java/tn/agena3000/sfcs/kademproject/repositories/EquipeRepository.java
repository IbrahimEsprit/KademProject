package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
