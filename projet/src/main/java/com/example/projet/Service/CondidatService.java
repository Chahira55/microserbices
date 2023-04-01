package com.example.projet.Service;

import com.example.projet.Model.Condidat;


public interface CondidatService {
    public Condidat findById(int id);

    Iterable<Condidat> findAll();
}
