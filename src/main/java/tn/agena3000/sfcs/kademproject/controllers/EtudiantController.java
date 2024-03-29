package tn.agena3000.sfcs.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServices;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServicesImp;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    private final IEtudiantServices iEtudiantServices;
    @GetMapping()
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getById(id);
    }
    @PostMapping()
    public void ajouterEtudiant(@RequestBody Etudiant e){
             iEtudiantServices.ajouterEtudiant(e);
    }
    @PutMapping("{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId,@PathVariable Integer departementId){
        iEtudiantServices.assignEtudiantToDepartement(etudiantId,departementId);
    }
    @PostMapping("{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContrat,@PathVariable Integer idEquipe) {
        return iEtudiantServices.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }
    @GetMapping("/departement/{idDepartement}")
    public List<Etudiant> getEtudiantsByDepartement(@PathVariable Integer idDepartement){
        return iEtudiantServices.getEtudiantsByDepartement(idDepartement);
    }
}
