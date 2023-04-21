package com.aluganaweb.AluganaWeb.controller;

import com.aluganaweb.AluganaWeb.entity.Produto;
import com.aluganaweb.AluganaWeb.entity.Proprietario;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoForm;
import com.aluganaweb.AluganaWeb.service.impl.ProdutoServiceIMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoServiceIMpl service;
    private ProdutoForm form;

    @PostMapping
    public Produto create() {
        return create(null);
    }

    @PostMapping
    public Produto create(@valid @RequestBody ProdutoForm form){
        this.form = form;
        return service.create(form);
    }

    @GetMapping("/proprietario/{id}")
    public List<Proprietario> getAllproprietarioId(@PathVariable long id){
        return service.getAllproprietarioId(id);
    }

   // @GetMapping
   // public List<Clientes> getAll(@RequestParam(value = "", required = false)){
  //     return service.getAll();
   // }
}
