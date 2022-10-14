package com.schindler.demo.controllers;

import com.schindler.demo.model.Abcd;
import com.schindler.demo.service.AbcdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewControlller {

    @Autowired
    private AbcdServiceImpl abcdService;

    @GetMapping("/")
    public List<Abcd> getNames(){
        return abcdService.findData();
    }

    @GetMapping("/{id}")
    public Abcd getName(@PathVariable String id){
        return abcdService.findById(id);
    }
}
