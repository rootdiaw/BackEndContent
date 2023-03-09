package com.example.der.services;

import com.example.der.entities.Option;

import java.util.List;

public interface OptionService {
    Option addNewOption(Option option);

    Option updateNewOption( Option option);

    List<Option> getAllOption( );

    Option getOptionParId( Long id);

    void deleteOptionParId(Long id);
}
