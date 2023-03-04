package tn.agena3000.sfcs.kademproject.services;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;
import tn.agena3000.sfcs.kademproject.repositories.ContratRepository;
import tn.agena3000.sfcs.kademproject.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IContratServicesImp implements IContratServices{
        private final ContratRepository contratRepository;
        private final EtudiantRepository etudiantRepository;

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

        @Override
        @Transactional
        public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
                //we used the method findbynomeandprenomE created in repository to get the nom and prenom of an etudiant
                Etudiant etudiant = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
                Contrat contrat = contratRepository.findById(ce.getIdContrat()).orElse(null);
                Assert.notNull(etudiant,"Etudiant 404 not found");
                Assert.notNull(contrat,"Contrat 404 not found");
                if (etudiant.getContrats().size() >= 5 ) {
                        return null;
                }
                etudiant.getContrats().add(contrat);
                etudiantRepository.save(etudiant);
                return contrat;
        }


}
