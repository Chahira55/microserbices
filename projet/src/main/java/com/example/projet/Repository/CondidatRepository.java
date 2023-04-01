package com.example.projet.Repository;

import com.example.projet.Model.Condidat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondidatRepository extends CrudRepository<Condidat,Integer> {

}
