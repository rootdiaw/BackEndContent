package com.example.der.repository;

import com.example.der.entities.Conbinaissons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConbinaissonsRepository extends JpaRepository<Conbinaissons, Long> {

    @Query(value = "select * from Conbinaissons " +
            "where ordonnee_idordonnee=?1 and abscisse_idabscisse=?2" , nativeQuery = true)
    Conbinaissons getConbinaissonMyOption(Long idordonnee, Long idabscsisse);
}
