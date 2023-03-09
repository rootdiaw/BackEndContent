 //package com.example.der.controllers;

//import com.example.der.entities.Axe;
//import com.example.der.services.;
import com.example.der.services.OptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/apiaxe")
/* public class AxeController {

        //private AxeService axeService;

    public AxeController(AxeService axeService){
            super();
            this.axeService=axeService;
    }
    @GetMapping
    public List<Axe> getAllAxe() {
        return axeService.getAllAxe();
    }

    @GetMapping("/id")
    public  Axe getAxeById(@PathVariable("id") Long id){
        return axeService.getAxeParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteAxe(@PathVariable("id") Long id){

        axeService.deleteAxeParId(id);

    }
    @PostMapping
    public Axe addAxe(@RequestBody Axe axe){
        return axeService.addNewAxe(axe);
    }
    @PutMapping("/{id}")
    public Axe updateAxe(@PathVariable("id") Long id, @RequestBody Axe axe){
        Axe axe1= axeService.getAxeParId(id);
        axe1.setLibelle(axe.getLibelle());


        return axeService.updateNewAxe(axe);
    }

}
*/
