package tn.agena3000.sfcs.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.sfcs.kademproject.entities.Departement;
import tn.agena3000.sfcs.kademproject.entities.Universite;
import tn.agena3000.sfcs.kademproject.repositories.DepartementRepository;
import tn.agena3000.sfcs.kademproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices {
    private final UniversiteRepository universiteRepository;

    private final DepartementRepository departementRepository;

    @Override
    public void ajoutUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByIdUniversite(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);
    }
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        if ((universite!=null) && (departement!=null)) {
            universite.getDepartement().add(departement);
            universiteRepository.save(universite);
        }
    }
}