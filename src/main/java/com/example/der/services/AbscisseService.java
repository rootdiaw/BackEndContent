package com.example.der.services;

import com.example.der.entities.Abscisse;

import java.util.List;

public interface AbscisseService {

    public Abscisse addNewAbscisse (Abscisse abscisse);
    public  Abscisse updateAbscisse(Abscisse abscisse);
    public List<Abscisse> getAllAbscisse();
    public  Abscisse getAbscisseParId(Long id);
    public void  deleteAbscisse(Long id);
}
