package com.example.der.services;

import com.example.der.entities.Abscisse;
import com.example.der.repository.AbscisseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbscisseServiceImpl implements AbscisseService{
    @Autowired
    private AbscisseRepository abscisseRepository;

    @Override
    public Abscisse addNewAbscisse(Abscisse abscisse) {
        return abscisseRepository.save(abscisse);
    }

    @Override
    public Abscisse updateAbscisse(Abscisse abscisse) {
        return abscisseRepository.save(abscisse);
    }

    @Override
    public List<Abscisse> getAllAbscisse() {
        return abscisseRepository.findAll();
    }

    @Override
    public Abscisse getAbscisseParId(Long id) {
        return abscisseRepository.findById(id).get();
    }

    @Override
    public void deleteAbscisse(Long id) {
        abscisseRepository.deleteById(id);
    }
}
