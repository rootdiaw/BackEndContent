package com.example.der.services;

import com.example.der.entities.Conbinaissons;
import com.example.der.repository.ConbinaissonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConbinaissonsServiceImpl implements  ConbinaissonsService{

    @Autowired
    private ConbinaissonsRepository conbinaissonsRepository;

    @Override
    public Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public Conbinaissons updateConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsRepository.findAll();
    }

    @Override
    public Conbinaissons getConbinaissonsParId(Long id) {
        return conbinaissonsRepository.findById(id).get();
    }

    @Override
    public void deleteConbinaissonsParId(Long id) {
        conbinaissonsRepository.deleteById(id);

    }

    @Override
    public Conbinaissons getConbinaissonsMy(Long idordonnee, Long idabscisse) {
        return conbinaissonsRepository.getConbinaissonMyOption(idordonnee,idabscisse);
    }
}
