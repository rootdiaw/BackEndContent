package com.example.der.services;

import com.example.der.entities.Sousoption;
import com.example.der.repository.Sousoptinrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SousoptionServiceImpl implements SousoptionService{

    @Autowired
    private Sousoptinrepository sousoptinrepository;

    @Override
    public Sousoption addNewSousOption(Sousoption sousoption) {
        return sousoptinrepository.save(sousoption);
    }

    @Override
    public Sousoption updateSousOption(Sousoption sousoption) {
        return sousoptinrepository.save(sousoption);
    }

    @Override
    public List<Sousoption> getAllSousOption() {
        return sousoptinrepository.findAll();
    }

    @Override
    public Sousoption getSousOptionParId(Long id) {
        return sousoptinrepository.findById(id).get();
    }

    @Override
    public void deleteSousOptionParId(Long id) {
        sousoptinrepository.deleteById(id);
    }

    @Override
    public List<Sousoption> getSousOptionParLibelle(String libelle) {
        return null;
    }
}
