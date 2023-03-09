package com.example.der.services;

import com.example.der.entities.Coordonnee;

import java.util.List;

public interface CoordonneeService {
    public Coordonnee addCoordonnee(Coordonnee coordonnee);
    public  Coordonnee updateCoordonnee(Coordonnee coordonnee);
    public List<Coordonnee> getAllCoordonnee();
    public  Coordonnee getCoordonneeParId(Long id);
    public  void  deleteCoordonneeParId(Long id);
}
