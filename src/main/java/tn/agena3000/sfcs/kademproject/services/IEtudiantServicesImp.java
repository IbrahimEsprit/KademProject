package tn.agena3000.sfcs.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;
import tn.agena3000.sfcs.kademproject.repositories.EtudiantRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices {

    private final EtudiantRepository etudiantRepository;
    @Override
    public void ajouterEtudiant(Etudiant e) {
            etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
            etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getById(int id) {
        return etudiantRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }
}
