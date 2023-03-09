/*package com.example.der.services;

import com.example.der.entities.Axe;
import com.example.der.repository.Axerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AxeServiceImpl implements AxeService{

    @Autowired
    private Axerepository axerepository;
    @Override
    public Axe addNewAxe(Axe axe) {
        return axerepository.save(axe);
    }

    @Override
    public Axe updateNewAxe(Axe axe) {

        return axerepository.save(axe);
    }

    @Override
    public List<Axe> getAllAxe() {
        return axerepository.findAll();
    }

    @Override
    public Axe getAxeParId(Long id) {
        return axerepository.findById(id).get();
    }

    @Override
    public void deleteAxeParId(Long id) {
        axerepository.deleteById(id);

    }
}
*/