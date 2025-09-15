package com.exemplo.crudmongo.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;  


@Document(collection = "pessoa") // Indica que esta classe é um documento MongoDB na coleção "pessoa"
public class Pessoa {

    @Id // Indica que este campo é o identificador único do documento
    private String id ;
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

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
