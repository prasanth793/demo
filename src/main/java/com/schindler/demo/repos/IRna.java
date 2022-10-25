package com.schindler.demo.repos;

import com.schindler.demo.model.Rna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRna extends CrudRepository<Rna, Integer> {

}
