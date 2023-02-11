package tn.agena3000.sfcs.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Etudiant;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServices;
import tn.agena3000.sfcs.kademproject.services.IEtudiantServicesImp;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    IEtudiantServices iEtudiantServices;
    @GetMapping()
    public String sayHello(){
        return "hello";
    }
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

}
