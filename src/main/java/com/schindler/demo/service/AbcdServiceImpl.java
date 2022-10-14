package com.schindler.demo.service;

import com.schindler.demo.model.Abcd;
import com.schindler.demo.repos.IAbcd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
 public class AbcdServiceImpl implements AbcdService{

    @Autowired
    private IAbcd iAbcd;

    @Override
    public List<Abcd> findData(){
        var data =  (List<Abcd>) iAbcd.findAll();
        return data;
    }

    public Abcd findById(String id){
        var data = iAbcd.findById(id);
        if(data.isPresent()){
            return data.get();
        }
        else{
            return new Abcd();
        }
    }

}
