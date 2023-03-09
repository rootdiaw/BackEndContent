package com.example.der.controllers;

import com.example.der.entities.Option;
import com.example.der.services.OptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apioption")
public class OptionRestController {
    private OptionService optionService;

    public OptionRestController(OptionService optionService) {
        this.optionService = optionService;
    }

    @GetMapping
    public List<Option> getAllOption() {
        return optionService.getAllOption();
    }

    @GetMapping("/id")
    public  Option getOptionById(@PathVariable("id") Long id){
        return optionService.getOptionParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOption(@PathVariable("id") Long id){

        optionService.deleteOptionParId(id);

    }
    @PostMapping
    public Option addOption(@RequestBody Option option){
        return optionService.addNewOption(option);
    }
    @PutMapping("/{id}")
    public Option updateOption(@PathVariable("id") Long id, @RequestBody Option option){
        Option opt= optionService.getOptionParId(id);
        opt.setLibelle(option.getLibelle());
        opt.setSousoption(option.getSousoption());


        return optionService.updateNewOption(option);
    }

}
