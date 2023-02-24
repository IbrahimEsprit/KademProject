package tn.agena3000.sfcs.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Universite;
import tn.agena3000.sfcs.kademproject.services.IUniversiteServices;

import java.util.List;

@RestController
@RequestMapping("universite")
@RequiredArgsConstructor
public class UniversiteController {
    private final IUniversiteServices iUniversiteServices;

    @GetMapping("/getAllUniversite")
    public List<Universite> getAllUniversite(){
        return iUniversiteServices.getAllUniversite();
    }
    @GetMapping("/getByIdUniversite/{id}")
    public Universite getByIdUniversite(@PathVariable int id){
        return iUniversiteServices.getByIdUniversite(id);
    }
    @DeleteMapping("/DeleteUniversite/{id}")
    public void deleteUniversite(@PathVariable int id){
        iUniversiteServices.deleteUniversite(id);
    }
    @PostMapping("ajoutUniversite")
    public void ajoutUniversite(@RequestBody Universite universite){
        iUniversiteServices.ajoutUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        iUniversiteServices.updateUniversite(universite);
        return universite;
    }
    @PutMapping("/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement) {
        iUniversiteServices.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
}
