package br.com.fatecbiblioteca.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @OneToOne
    private LeitorEntity LeitorEntity;
    @OneToOne
    private LivroEntity LivroEntity;
    private String Movimentacao;
    private LocalDateTime DataMovimentacao;

    public EmprestimoEntity() {
    }

    public EmprestimoEntity(Long id, LeitorEntity leitorEntity, LivroEntity livroEntity, String movimentacao, LocalDateTime dataMovimentacao) {
        Id = id;
        LeitorEntity = leitorEntity;
        LivroEntity = livroEntity;
        Movimentacao = movimentacao;
        DataMovimentacao = dataMovimentacao;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LeitorEntity getLeitorEntity() {
        return LeitorEntity;
    }

    public void setLeitorEntity(LeitorEntity leitorEntity) {
        LeitorEntity = leitorEntity;
    }

    public LivroEntity getLivroEntity() {
        return LivroEntity;
    }

    public void setLivroEntity(LivroEntity livroEntity) {
        LivroEntity = livroEntity;
    }

    public String getMovimentacao() {
        return Movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        Movimentacao = movimentacao;
    }

    public LocalDateTime getDataMovimentacao() {
        return DataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        DataMovimentacao = dataMovimentacao;
    }

}
