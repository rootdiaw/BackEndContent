package com.example.der.controllers;

import com.example.der.entities.Abscisse;
import com.example.der.entities.Ordonnee;
import com.example.der.services.OrdonneeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiordonnee")
public class OrdonneeController {

    private OrdonneeService ordonneeService;


    public OrdonneeController(OrdonneeService ordonneeService) {
        this.ordonneeService = ordonneeService;
    }

    @GetMapping
    public List<Ordonnee> getAllOrdonnee() {
        return ordonneeService.getAllOrdonnee();
    }

    @GetMapping("/id")
    public Ordonnee getOrdonneeById(@PathVariable("id") Long id){

        return ordonneeService.getOrdonneeParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOrdonnee(@PathVariable("id") Long id){

        ordonneeService.deleteOrdonneParId(id);

    }
    @PostMapping
    public Ordonnee addOrdonnee(@RequestBody Ordonnee ordonnee){
        return ordonneeService.addNewOrdonnee(ordonnee);
    }
    @PutMapping("/{id}")
    public Ordonnee updateOrdonnee(@PathVariable("id") Long id, @RequestBody Ordonnee ordonnee){
        Ordonnee ord= ordonneeService.getOrdonneeParId(id);
        ord.setLibelle(ordonnee.getLibelle());
        ord.setCoordonnees(ordonnee.getCoordonnees());

        return ordonneeService.updateOrdonnee(ordonnee);
    }
}
