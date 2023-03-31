package tn.agena3000.sfcs.kademproject.controllers;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.services.IContratServices;

import java.util.List;

@Tag(name= "Partie Contrat")
@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContratServices iContratServices;

    @GetMapping()
    public List<Contrat> getAllContrat(){
        return iContratServices.getAllContrat();
    }
    @GetMapping("/{id}")
    public Contrat getByIdContrat(@PathVariable int id){
        return iContratServices.getByIdContrat(id);
    }
    @DeleteMapping("/{id}")
    private void deleteContrat(@PathVariable int id){
        iContratServices.deleteContrat(id);
    }
    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat){
        iContratServices.ajouterContrat(contrat);
    }
    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat){
        iContratServices.updateContrat(contrat);
        return contrat;
    }
    @GetMapping("/{ce}/{nomE}/{prenomE}")
    public Contrat affectContratToEtudiant(@PathVariable Contrat ce,@PathVariable String nomE,@PathVariable String prenomE) {
        iContratServices.affectContratToEtudiant(ce,nomE,prenomE);
        return ce;
    }

}
