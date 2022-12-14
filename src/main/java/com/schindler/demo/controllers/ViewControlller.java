package com.schindler.demo.controllers;

import com.schindler.demo.model.Rna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewControlller {


    @Value("${spring.custom.prop}")
    private String valueFromProp;

    @GetMapping("/")
    public String getValue(){
        return valueFromProp;
    }


   }
