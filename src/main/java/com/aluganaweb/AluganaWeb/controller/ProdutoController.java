package com.aluganaweb.AluganaWeb.controller;

import com.aluganaweb.AluganaWeb.entity.Produto;
import com.aluganaweb.AluganaWeb.entity.Proprietario;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoForm;
import com.aluganaweb.AluganaWeb.service.impl.ProdutoServiceIMpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoServiceIMpl service;

    @PostMapping
    public Produto create(@Valid @RequestBody ProdutoForm form){
         return service.create(form);
    }

    @GetMapping("/proprietario/{id}")
    public List<Proprietario> getAllproprietarioId(@PathVariable long id){
        return (List<Proprietario>) service.getAllProprietario(id);
    }

   // @GetMapping
   // public List<Clientes> getAll(@RequestParam(value = "", required = false)){
  //     return service.getAll();
   // }
}
