package tn.agena3000.sfcs.kademproject.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.services.IContratServices;

import java.util.List;

@RestController
public class ContratController {
    @Autowired
    private IContratServices iContratServices;

    @GetMapping("/getAllContrat")
    public List<Contrat> getAllContrat(){
        return iContratServices.getAllContrat();
    }
    @GetMapping("/getByIdContrat/{id}")
    public Contrat getByIdContrat(@PathVariable int id){
        return iContratServices.getByIdContrat(id);
    }
    @DeleteMapping("/deleteContrat/{id}")
    private void deleteContrat(@PathVariable int id){
        iContratServices.deleteContrat(id);
    }
    @PostMapping("/ajouterContrat")
    public void ajouterContrat(@RequestBody Contrat contrat){
        iContratServices.ajouterContrat(contrat);
    }
    @PutMapping("/updateContrat")
    private Contrat updateContrat(@RequestBody Contrat contrat){
        iContratServices.updateContrat(contrat);
        return contrat;
    }

}
