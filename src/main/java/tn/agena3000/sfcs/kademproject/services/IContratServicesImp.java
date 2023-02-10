package tn.agena3000.sfcs.kademproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.repositories.ContratRepository;

import java.util.List;

@Service
public class IContratServicesImp implements IContratServices{

        @Autowired
    private ContratRepository contratRepository;

        @Override
        public void ajouterContrat(Contrat c){
            contratRepository.save(c);
        }
        @Override
        public void updateContrat(Contrat c) {
            contratRepository.save(c);
        }

        @Override
        public List<Contrat> getAllContrat() {
            return contratRepository.findAll();
        }

        @Override
        public Contrat getByIdContrat(Integer id) {
            return contratRepository.findById(id).orElse(null);
        }

        @Override
        public void deleteContrat(Integer id) {
            contratRepository.deleteById(id);
        }

}
