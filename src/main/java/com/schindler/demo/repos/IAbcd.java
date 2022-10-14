package com.schindler.demo.repos;

import com.schindler.demo.model.Abcd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAbcd extends CrudRepository<Abcd,String> {

}
