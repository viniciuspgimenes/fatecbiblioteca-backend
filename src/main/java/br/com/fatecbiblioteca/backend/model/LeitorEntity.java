package br.com.fatecbiblioteca.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LeitorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Nome;
    private String Cpf;
    private String Preferencias;

    public LeitorEntity() {
    }

    public LeitorEntity(Long id, String nome, String cpf, String preferencias) {
        Id = id;
        Nome = nome;
        Cpf = cpf;
        Preferencias = preferencias;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(String preferencias) {
        Preferencias = preferencias;
    }
}
