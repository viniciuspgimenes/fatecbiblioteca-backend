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
    private String MovimentacaoEnum;
    private LocalDateTime DataMovimentacao;

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

    public String getMovimentacaoEnum() {
        return MovimentacaoEnum;
    }

    public void setMovimentacaoEnum(String movimentacaoEnum) {
        MovimentacaoEnum = movimentacaoEnum;
    }

    public LocalDateTime getDataMovimentacao() {
        return DataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        DataMovimentacao = dataMovimentacao;
    }

    public EmprestimoEntity() {
    }

    public EmprestimoEntity(Long id, LeitorEntity leitorEntity, LivroEntity livroEntity, String movimentacaoEnum, LocalDateTime dataMovimentacao) {
        Id = id;
        LeitorEntity = leitorEntity;
        LivroEntity = livroEntity;
        MovimentacaoEnum = movimentacaoEnum;
        DataMovimentacao = dataMovimentacao;
    }
}
