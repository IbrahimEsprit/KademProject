package tn.agena3000.sfcs.kademproject.services;

import tn.agena3000.sfcs.kademproject.entities.DetailEquipe;
import tn.agena3000.sfcs.kademproject.entities.Equipe;

import java.util.List;

public interface IEquipeServices {
    void ajouterEquipe(Equipe e);
    void updateEquipe(Equipe e);
    List<Equipe> getAllEquipe();
    Equipe getByIdEquipe(Integer id);
    void deleteEquipe(Integer id);
}
