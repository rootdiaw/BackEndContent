package com.example.der.services;

import com.example.der.entities.Conbinaissons;

import java.util.List;

public interface ConbinaissonsService {
    Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons);
    Conbinaissons updateConbinaissons( Conbinaissons conbinaissons);
    List<Conbinaissons> getAllConbinaissons( );
   public Conbinaissons getConbinaissonsParId(Long id);
    void deleteConbinaissonsParId(Long id);
    // Conbinaissons getConbinaissons(Catastrophe catastrophe, List<SousOption> sousOptions );

   Conbinaissons getConbinaissonsMy(Long idordonnee, Long idabscisse);


}
