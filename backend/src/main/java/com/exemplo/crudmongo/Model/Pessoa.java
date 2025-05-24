package com.exemplo.crudmongo.Model;

// Importa as anotações e utilitários necessários
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Classe que representa uma pessoa no sistema.
 * Mapeada para a coleção "pessoas" no MongoDB.
 */
@Data // Gera automaticamente getters, setters, equals, hashCode e toString
@Document(collection = "pessoas") // Indica que esta classe é um documento MongoDB
public class Pessoa {
    @Id // Indica o campo como identificador único no MongoDB
    private String id;
    private String nome;
    private int idade;

    // Getter para o campo id
    public String getId() {
        return id;
    }

    // Setter para o campo id
    public void setId(String id) {
        this.id = id;
    }

    // Getter para o campo nome
    public String getNome() {
        return nome;
    }

    // Setter para o campo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o campo idade
    public int getIdade() {
        return idade;
    }

    // Setter para o campo idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
