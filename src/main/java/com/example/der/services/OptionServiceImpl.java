package com.example.der.services;

import com.example.der.entities.Option;
import com.example.der.repository.Optionrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private Optionrepository optionrepository;

    @Override
    public Option addNewOption(Option option) {
        return optionrepository.save(option);
    }

    @Override
    public Option updateNewOption(Option option) {
        return optionrepository.save(option);
    }

    @Override
    public List<Option> getAllOption() {
        return optionrepository.findAll();
    }

    @Override
    public Option getOptionParId(Long id) {
        return optionrepository.findById(id).get();
    }

    @Override
    public void deleteOptionParId(Long id) {
            optionrepository.deleteById(id);
    }
}
