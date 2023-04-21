package com.aluganaweb.AluganaWeb.service;

import com.aluganaweb.AluganaWeb.entity.Produto;
import com.aluganaweb.AluganaWeb.entity.Proprietario;
import com.aluganaweb.AluganaWeb.entity.form.ProprietarioForm;
import com.aluganaweb.AluganaWeb.entity.form.ProprietarioUpdate;


import java.util.List;

public interface IPropietarioService {
    /**
     * Cria um Propietario e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Propietario no banco de dados.
     * @return Propietario recém-criado.
     */
    Proprietario create(ProprietarioForm form);

    /**
     * Retorna um Propietario que está no banco de dados de acordo com seu Id.
     * @param id id do Propietario que será exibido.
     * @return Propietario de acordo com o Id fornecido.
     */
    Proprietario get(Long id);

    /**
     * Retorna os Propietario que estão no banco de dados.
     * @return Uma lista os Propietario que estão salvas no DB.
     */
    List<Proprietario> getAll();

    /**
     * Atualiza o Propietario.
     * @param id id do Propietario que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Propietario
     * no banco de dados.
     * @return Propietario recém-atualizado.
     */
    Proprietario update(Long id, ProprietarioUpdate formUpdate);

    /**
     * Deleta um Propietario específico.
     * @param id id do Propietario que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do Propietario que será recuperada a lista de avaliações
     * @return uma lista com todos os produtos dos Propietario de acordo com o Id
     */
    List<Produto> getAllProdutoId(Long id);
}
