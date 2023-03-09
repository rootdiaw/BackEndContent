package com.example.der.services;

import java.util.List;
import  com.example.der.entities.Sousoption;

public interface SousoptionService {
    Sousoption addNewSousOption(Sousoption sousoption);
    Sousoption updateSousOption( Sousoption sousoption);
    List<Sousoption> getAllSousOption( );
    Sousoption getSousOptionParId( Long id);
    void deleteSousOptionParId(Long id);

    List<Sousoption> getSousOptionParLibelle(String libelle);
}
