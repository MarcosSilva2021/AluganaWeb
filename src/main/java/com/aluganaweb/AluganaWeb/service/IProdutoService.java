package com.aluganaweb.AluganaWeb.service;

import com.aluganaweb.AluganaWeb.entity.Produto;
import com.aluganaweb.AluganaWeb.entity.Proprietario;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoForm;
import com.aluganaweb.AluganaWeb.entity.form.ProdutoUpdate;

import java.util.List;

public interface IProdutoService {
    /**
     * Cria um Produto e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Produto no banco de dados.
     * @return Produto recém-criado.
     */
    Produto create(ProdutoForm form);

    /**
     * Retorna um Produto que está no banco de dados de acordo com seu Id.
     * @param id id do Produto que será exibido.
     * @return Produto de acordo com o Id fornecido.
     */
    Produto get(Long id);

    /**
     * Retorna os Produto que estão no banco de dados.
     * @return Uma lista os Produto que estão salvas no DB.
     * List<Produto> getAll(String dataDeNascimento);
     */
    List<Produto> getAll();


    /**
     * Atualiza o Produto.
     * @param id id do Produto que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Produto
     * no banco de dados.
     * @return Produto recém-atualizado.
     */
    Produto update(Long id, ProdutoUpdate formUpdate);

    /**
     * Deleta um Produto específico.
     * @param id id do Produto que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do Produto que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     * vai para a PROPRIETARIO
     * List<Produto> getAllProdutoId(Long id);
     */

    /**
     *
     * @param id id do Proprietario que será recuperada a lista de proprietarios
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     * vai para a PROPRIETARIO
     * List<Produto> getAllProdutoId(Long id);
     */
    Proprietario getAllProprietario(Long id);

}
