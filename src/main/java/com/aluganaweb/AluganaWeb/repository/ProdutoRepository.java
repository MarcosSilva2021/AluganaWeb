package com.aluganaweb.AluganaWeb.repository;

import com.aluganaweb.AluganaWeb.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Override
    List<Produto> findAllById(Iterable<Long> longs);
}
