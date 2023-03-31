package tn.agena3000.sfcs.kademproject.services;

import tn.agena3000.sfcs.kademproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getById(int id);
    void deleteEtudiant(int id);
    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}
