package com.aluganaweb.AluganaWeb.controller;


import com.aluganaweb.AluganaWeb.entity.Proprietario;
import com.aluganaweb.AluganaWeb.entity.form.ProprietarioForm;
import com.aluganaweb.AluganaWeb.service.impl.ProprietarioServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioControler {
    
    @Autowired
    private ProprietarioServiceImpl service;


   // @PostMapping
   // public Proprietario create(@Valid @RequestBody ProprietarioForm form){
  //     return service.create(form);
    //}

    //GetMapping
    //public List<Proprietario> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        //return service.getAll(bairro);
   // }
}
