package com.exemplo.crudmongo.service;

import com.exemplo.crudmongo.Model.Pessoa;
import com.exemplo.crudmongo.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço responsável pela lógica de negócio relacionada à entidade Pessoa.
 */
@Service // Indica que esta classe é um serviço do Spring
public class PessoaService {

    private final PessoaRepository repository; // Repositório para acesso ao banco de dados

    /**
     * Injeta o repositório PessoaRepository via construtor.
     */
    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    /**
     * Retorna todas as pessoas cadastradas no banco de dados.
     * @return Lista de pessoas
     */
    public List<Pessoa> listarTodas() {
        return repository.findAll();
    }

    /**
     * Salva uma nova pessoa no banco de dados.
     * @param pessoa Objeto Pessoa a ser salvo
     * @return Pessoa salva
     */
    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    /**
     * Atualiza uma pessoa existente pelo ID.
     * @param id Identificador da pessoa a ser atualizada
     * @param novaPessoa Dados atualizados da pessoa
     * @return Pessoa atualizada
     */
    public Pessoa atualizar(String id, Pessoa novaPessoa) {
        Pessoa pessoa = repository.findById(id).orElseThrow(); // Busca a pessoa pelo ID ou lança exceção se não encontrar
        pessoa.setNome(novaPessoa.getNome()); // Atualiza o nome
        pessoa.setIdade(novaPessoa.getIdade()); // Atualiza a idade
        return repository.save(pessoa); // Salva as alterações
    }

    /**
     * Exclui uma pessoa pelo ID.
     * @param id Identificador da pessoa a ser excluída
     */
    public void excluir(String id) {
        repository.deleteById(id);
    }
}
