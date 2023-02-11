package tn.agena3000.sfcs.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.sfcs.kademproject.entities.Departement;
import tn.agena3000.sfcs.kademproject.repositories.DepartementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDepartementServicesImp implements IDepartementServices{
    private final DepartementRepository departementRepository;
    @Override
    public void ajouterDepartement(Departement d) {
        departementRepository.save(d);
    }

    @Override
    public void updateDepartement(Departement d) {
        departementRepository.save(d);
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getByIdDepartement(Integer id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartement(Integer id) {
        departementRepository.deleteById(id);
    }
}
