package com.example.projet.Service.ServiceImpl;

import com.example.projet.Model.Condidat;
import com.example.projet.Repository.CondidatRepository;
import com.example.projet.Service.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondidatServiceImpl implements CondidatService {
    @Autowired
    CondidatRepository condidatRepository;
    @Override
    public Condidat findById(int id){
        return condidatRepository.findById(id).orElseThrow(()-> new RuntimeException());
    }
    @Override
    public Iterable<Condidat> findAll(){
        return condidatRepository.findAll();
    }
}
