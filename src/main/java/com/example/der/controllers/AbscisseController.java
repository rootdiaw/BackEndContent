package com.example.der.controllers;

import com.example.der.entities.Abscisse;
import com.example.der.services.AbscisseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiabscisse")
public class AbscisseController {

    private AbscisseService abscisseService;

    public AbscisseController(AbscisseService abscisseService) {
        super();
        this.abscisseService = abscisseService;
    }

    @GetMapping
    public List<Abscisse> getAllAbscisse() {
        return abscisseService.getAllAbscisse();
    }

    @GetMapping("/id")
    public  Abscisse getAbscisseById(@PathVariable("id") Long id){

        return abscisseService.getAbscisseParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteAbscisse(@PathVariable("id") Long id){

        abscisseService.deleteAbscisse(id);

    }
    @PostMapping
    public Abscisse addAbscisse(@RequestBody Abscisse abscisse){
        return abscisseService.addNewAbscisse(abscisse);
    }
    @PutMapping("/{id}")
    public Abscisse updateAbscisse(@PathVariable("id") Long id, @RequestBody Abscisse abscisse){
        Abscisse abs= abscisseService.getAbscisseParId(id);
        abs.setLibelle(abscisse.getLibelle());
        abs.setCoordonnees(abscisse.getCoordonnees());

        return abscisseService.updateAbscisse(abscisse);
    }
}
