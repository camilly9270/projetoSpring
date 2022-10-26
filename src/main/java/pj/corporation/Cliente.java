package pj.corporation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cliente {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String nome;

    private String endereco;

    public Long getId() {
        return id;
    }


    public Cliente(){

    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String endereco, String nome) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
