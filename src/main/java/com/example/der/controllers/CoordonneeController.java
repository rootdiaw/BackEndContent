package com.example.der.controllers;

import com.example.der.entities.Coordonnee;
import com.example.der.services.CoordonneeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apicoordonnee")
public class CoordonneeController {

    private CoordonneeService coordonneeService;

    public CoordonneeController(CoordonneeService coordonneeService) {
        super();
        this.coordonneeService = coordonneeService;
    }

    @GetMapping
    public List<Coordonnee> getAllCoordonnee(){
        return coordonneeService.getAllCoordonnee();
    }
    @GetMapping("/{id}")
    public  Coordonnee getCoordonneeById(@PathVariable("id") Long id ){
        return coordonneeService.getCoordonneeParId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCoordonneeById(@PathVariable("id") Long id){
        coordonneeService.deleteCoordonneeParId(id);

    }

    @PostMapping
    public Coordonnee newCooordonnee(@RequestBody Coordonnee coordonnee){
        return coordonneeService.addCoordonnee(coordonnee);
    }

    @PutMapping("/{id}")
    public Coordonnee updateCoordonnee(@PathVariable("id") Long id, @RequestBody Coordonnee coordonnee){
        Coordonnee coord=coordonneeService.getCoordonneeParId(id);
        coord.setLibelle(coordonnee.getLibelle());

        return  coordonneeService.updateCoordonnee(coordonnee);
    }
}
