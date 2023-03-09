package com.example.der.controllers;


import com.example.der.entities.Sousoption;
import com.example.der.services.SousoptionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apisousoption")
public class SousoptionController {

    private SousoptionService sousoptionService;

    public SousoptionController(SousoptionService sousoptionService) {
        super();
        this.sousoptionService=sousoptionService;

    }


    @GetMapping
    public  List<Sousoption> getAllSousOption(){
       return sousoptionService.getAllSousOption();
    }

    @GetMapping("/{id}")
    public Sousoption getSousOptionById(@PathVariable("id") Long id){
        return sousoptionService.getSousOptionParId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSousOption(@PathVariable("id") Long id){
        sousoptionService.deleteSousOptionParId(id);
    }

    @PostMapping
    public Sousoption addSousOption(@RequestBody Sousoption sousoption){
        return sousoptionService.addNewSousOption(sousoption);
    }
    @PutMapping("/{id}")
    public  Sousoption updateSousOption(@PathVariable("id") Long id, @RequestBody Sousoption sousoption){
            Sousoption sopt=sousoptionService.getSousOptionParId(id);

            sopt.setLibelle((sousoption.getLibelle()));
            return sousoptionService.updateSousOption(sousoption);
    }
}
