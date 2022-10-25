package com.schindler.demo.service;

import com.schindler.demo.model.Rna;
import com.schindler.demo.repos.IRna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RnaServiceImpl implements RnaService{

    @Autowired
    private IRna iRna;

    @Override
    public Rna findById(Integer id) {

        var data = iRna.findById(id);

        return data.get();
    }
}
