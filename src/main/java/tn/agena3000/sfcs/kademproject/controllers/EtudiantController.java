package tn.agena3000.sfcs.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServices;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServicesImp;

import java.util.List;

@RestController
public class EtudiantController {
    @Autowired
    IEtudiantServices iEtudiantServices;
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/getAll")
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("/getID/{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getById(id);
    }
    @PostMapping("/getID/{id}")
    public void ajouterEtudiant(@RequestBody Etudiant e){
             iEtudiantServices.ajouterEtudiant(e);
    }

}
