package com.example.der.services;

import com.example.der.entities.Coordonnee;
import com.example.der.repository.Coordonneerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordonneeServiceImpl implements CoordonneeService{

    @Autowired
    private Coordonneerepository coordonneerepository;
    @Override
    public Coordonnee addCoordonnee(Coordonnee coordonnee) {
        return coordonneerepository.save(coordonnee);
    }

    @Override
    public Coordonnee updateCoordonnee(Coordonnee coordonnee) {
        return coordonneerepository.save(coordonnee);
    }

    @Override
    public List<Coordonnee> getAllCoordonnee() {
        return coordonneerepository.findAll();
    }

    @Override
    public Coordonnee getCoordonneeParId(Long id) {
        return coordonneerepository.findById(id).get();
    }

    @Override
    public void deleteCoordonneeParId(Long id) {
        coordonneerepository.deleteById(id);

    }
}
