package com.aluganaweb.AluganaWeb.service;

import com.aluganaweb.AluganaWeb.entity.Cliente;
import com.aluganaweb.AluganaWeb.entity.form.ClienteForm;
import com.aluganaweb.AluganaWeb.entity.form.ClienteUpdate;

import java.util.List;

public interface IClienteService {

    /**
     * Cria um Cliente e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Cliente no banco de dados.
     * @return Cliente recém-criado.
     */
    Cliente create(ClienteForm form);

    /**
     * Retorna um Cliente que está no banco de dados de acordo com seu Id.
     * @param id id do Cliente que será exibido.
     * @return Cliente de acordo com o Id fornecido.
     */
    Cliente get(Long id);

    /**
     * Retorna os Cliente que estão no banco de dados.
     * @return Uma lista os Cliente que estão salvas no DB.
     * List<Cliente> getAll();
     */
    List<Cliente> getAll();


    /**
     * Atualiza o Cliente.
     * @param id id do Cliente que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Cliente
     * no banco de dados.
     * @return Cliente recém-atualizado.
     */
    Cliente update(Long id, ClienteUpdate formUpdate);

    /**
     * Deleta um Cliente específico.
     * @param id id do Cliente que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do Cliente que será recuperada a lista de avaliações
     * @return uma lista com todas os produtos do cliente de acordo com o Id
     * vai para a PROPRIETARIO
     * List<Produto> getAllProdutoId(Long id);
     */


}
