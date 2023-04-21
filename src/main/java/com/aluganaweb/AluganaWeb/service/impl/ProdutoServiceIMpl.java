package com.aluganaweb.AluganaWeb.service.impl;

import com.aluganaweb.AluganaWeb.entity.Produto;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoForm;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoUpdate;
import com.aluganaweb.AluganaWeb.service.IProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoServiceIMpl implements IProdutoService {


    @Override
    public Produto create(ProdutoForm form) {
        return null;
    }

    @Override
    public Produto get(Long id) {
        return null;
    }

    @Override
    public List<Produto> getAll() {
        return null;
    }

    @Override
    public Produto update(Long id, ProdutoUpdate formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
