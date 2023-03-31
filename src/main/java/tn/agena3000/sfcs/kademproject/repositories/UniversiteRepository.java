package tn.agena3000.sfcs.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.entities.Departement;
import tn.agena3000.sfcs.kademproject.entities.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
    //JPQL
    @Query("Select u.departement from Universite u where u.nomUniv = ?1")
    List<Departement> getAllDepartementBynomuniv(String nomU);

    //native SQL
    //my query
    /*@Query(value = "Select depts from departement where iddepart in (select iddepart from universite_departements where iddepart=iduniv where iduniv in (select iduniv from universite where nomuniv=?1))",nativeQuery = true)
    List<Departement> getAllDepartementBynomunivSQL(String nomU);*/
    //or - class query
    @Query(value = "select * from departement d " +
            "inner join universite_departements ud " +
            "on ud.departements_id_depart = d.id_depart " +
            "inner join universite u " +
            "on u.id_univ = ud.universite_id_univ " +
            "where u.nom_univ =?1", nativeQuery = true)
    List<Departement> getAllDepartsByNomUnivSQL(String nomU);
    @Query("Select d from Departement d order by size(d.etu) desc ")
    List<Departement> getListDepartementsTrieeparEtudiants();
    //or
    //Sql query
    /*@Query(value = "select * from departement d orderBy(select count(*) from etudiant where d.id = e.id_depart",nativeQuery = true)
    List<Departement> getListDepartementsTrieeparEtudiants();*/

}
