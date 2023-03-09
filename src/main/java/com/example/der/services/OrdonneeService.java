package com.example.der.services;

import com.example.der.entities.Ordonnee;

import java.util.List;

public interface OrdonneeService {

    public Ordonnee addNewOrdonnee(Ordonnee ordonnee);
    public  Ordonnee updateOrdonnee(Ordonnee ordonnee);
    public List<Ordonnee> getAllOrdonnee();
    public  Ordonnee getOrdonneeParId(Long id);
    public  void deleteOrdonneParId(Long id);
}
