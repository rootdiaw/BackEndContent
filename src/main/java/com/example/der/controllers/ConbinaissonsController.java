package com.example.der.controllers;

import com.example.der.entities.Conbinaissons;
import com.example.der.services.ConbinaissonsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiconbinaissons")
public class ConbinaissonsController {
    private ConbinaissonsService conbinaissonsService;

    public ConbinaissonsController(ConbinaissonsService conbinaissonsService) {
        super();
        this.conbinaissonsService = conbinaissonsService;
    }
    @GetMapping
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsService.getAllConbinaissons();
    }
    @GetMapping("/{id}")
    public  Conbinaissons getConbinaissonsById(@PathVariable("id") Long id){
        return conbinaissonsService.getConbinaissonsParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteConbinaissons(@PathVariable("id") Long id){
        conbinaissonsService.deleteConbinaissonsParId(id);
    }
    @PostMapping
    public Conbinaissons addConbinaissons(@RequestBody Conbinaissons conbinaissons){
        return conbinaissonsService.addNewConbinaissons(conbinaissons);
    }
    @PutMapping("/{id}")
    public Conbinaissons updateConbinaissons(@PathVariable("id") Long id, @RequestBody Conbinaissons conbinaissons) {
        Conbinaissons conbinaissons1 = conbinaissonsService.getConbinaissonsParId(id);
        conbinaissons1.setOption(conbinaissons.getOption());
       // conbinaissons1.setAxes(conbinaissons.getAxes());

        return conbinaissonsService.updateConbinaissons(conbinaissons);
    }

    @PostMapping("/my")
    public Conbinaissons getConbinaissonsMy(@RequestBody Conbinaissons conbinaisson){
       // System.out.println("ejjeje==="+conbinaisson.toString());
        return conbinaissonsService.getConbinaissonsMy(conbinaisson.getOrdonnee().getIdordonnee(),
                conbinaisson.getAbscisse().getIdabscisse());
    }

}
