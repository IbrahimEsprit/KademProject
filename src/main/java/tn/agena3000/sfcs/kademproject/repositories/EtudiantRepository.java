package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    // x = nomE et y = prenomE .. in parameters you don't need to use specific attributes.
    // The attributes needs to start with a capital letter
    Etudiant findByNomEAndPrenomE(String x,String y);
    List<Etudiant> findByDepartement(Integer iddepartement);

    //index parameter
    //@Query("Select e from Etudiant e where e.nomE = ?1 and e.prenomE = ?2")
    // or
    @Query("Select e from Etudiant e where e.nomE=:nom  and e.prenomE=:prenom")
    Etudiant getEtudiantbynomprenom(@Param("nom") String nom, @Param("prenom") String prenom);
}
