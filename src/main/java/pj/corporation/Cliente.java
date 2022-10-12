package pj.corporation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    private long id;
    private String cpf;
    private String nome;
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public Cliente(){
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
