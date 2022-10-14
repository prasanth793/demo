package com.schindler.demo.service;

import com.schindler.demo.model.Abcd;
import com.schindler.demo.repos.IAbcd;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

 interface AbcdService  {

    List<Abcd> findData();

    Abcd findById(String id);




}
