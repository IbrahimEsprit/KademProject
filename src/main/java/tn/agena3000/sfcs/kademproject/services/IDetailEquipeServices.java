package tn.agena3000.sfcs.kademproject.services;

import tn.agena3000.sfcs.kademproject.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeServices {
    void ajouterDetailEquipe(DetailEquipe de);
    void updateDetailEquipe(DetailEquipe de);
    List<DetailEquipe> getAllDetailEquipe();
    DetailEquipe getByIdDetailEquipe(Integer id);
    void deleteDetailEquipe(Integer id);
}

