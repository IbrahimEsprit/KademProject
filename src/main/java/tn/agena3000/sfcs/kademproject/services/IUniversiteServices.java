package tn.agena3000.sfcs.kademproject.services;

import tn.agena3000.sfcs.kademproject.entities.Universite;

import java.util.List;

public interface IUniversiteServices {
    void ajoutUniversite(Universite u);
    void updateUniversite(Universite u);
    List<Universite> getAllUniversite();
    Universite getByIdUniversite(Integer id);
    void deleteUniversite(Integer id);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
