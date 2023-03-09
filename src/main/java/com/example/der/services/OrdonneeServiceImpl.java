package com.example.der.services;

import com.example.der.entities.Ordonnee;
import com.example.der.repository.OrdonneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdonneeServiceImpl implements OrdonneeService{

    @Autowired
    private OrdonneeRepository ordonneeRepository;
    @Override
    public Ordonnee addNewOrdonnee(Ordonnee ordonnee) {
        return ordonneeRepository.save(ordonnee);
    }

    @Override
    public Ordonnee updateOrdonnee(Ordonnee ordonnee) {
        return ordonneeRepository.save(ordonnee);
    }

    @Override
    public List<Ordonnee> getAllOrdonnee() {
        return ordonneeRepository.findAll();
    }

    @Override
    public Ordonnee getOrdonneeParId(Long id) {
        return ordonneeRepository.findById(id).get();
    }

    @Override
    public void deleteOrdonneParId(Long id) {
        ordonneeRepository.deleteById(id);
    }
}
