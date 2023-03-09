package com.example.der.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Conbinaissons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idconbinaissons;
    //@OneToMany
   // private List<Axe> axes;
    @OneToOne
    private Ordonnee ordonnee;
    @OneToOne
    private Abscisse abscisse;
    @OneToOne
    private Option option;
}
