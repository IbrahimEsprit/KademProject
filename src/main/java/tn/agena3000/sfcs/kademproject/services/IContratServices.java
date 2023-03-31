package tn.agena3000.sfcs.kademproject.services;
import tn.agena3000.sfcs.kademproject.entities.Contrat;


import java.util.Date;
import java.util.List;

public interface IContratServices {
    void ajouterContrat(Contrat c);
    void updateContrat(Contrat d);
    List<Contrat> getAllContrat();
    Contrat getByIdContrat(Integer id);
    void deleteContrat(Integer id);
    Contrat affectContratToEtudiant(Contrat ce, String nomE,String prenomE);
    //map<String,float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate);


}
