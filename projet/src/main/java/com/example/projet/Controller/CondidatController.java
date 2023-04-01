package com.example.projet.Controller;

import com.example.projet.Model.Condidat;
import com.example.projet.Service.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/condidat")
public class CondidatController {
    @Autowired
    CondidatService condidatService;
    @GetMapping("/{id}")
    ResponseEntity<Condidat> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(condidatService.findById(id));
    }

}
