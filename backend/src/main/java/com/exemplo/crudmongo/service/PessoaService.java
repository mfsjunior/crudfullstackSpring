package com.exemplo.crudmongo.service;

import com.exemplo.crudmongo.Model.Pessoa;
import com.exemplo.crudmongo.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;
    

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listarTodas() {
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizar(String id, Pessoa novaPessoa) {
        Pessoa pessoa = repository.findById(id).orElseThrow();
        pessoa.setNome(novaPessoa.getNome());
        pessoa.setIdade(novaPessoa.getIdade());
        return repository.save(pessoa);
    }

    public void excluir(String id) {
        repository.deleteById(id);
    }
}
