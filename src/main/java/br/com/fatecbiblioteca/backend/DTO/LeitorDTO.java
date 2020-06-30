package br.com.fatecbiblioteca.backend.DTO;

import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LeitorDTO {
    private Long Id;
    private String Nome;
    private String Cpf;
    private String Preferencias;

    public LeitorDTO(LeitorEntity leitorEntity) {
        Id = leitorEntity.getId();
        Nome = leitorEntity.getNome();
        Cpf = leitorEntity.getCpf();
        Preferencias = leitorEntity.getPreferencias();
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
