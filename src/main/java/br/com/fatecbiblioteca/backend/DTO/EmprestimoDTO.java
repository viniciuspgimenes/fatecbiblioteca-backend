package br.com.fatecbiblioteca.backend.DTO;

import br.com.fatecbiblioteca.backend.model.EmprestimoEntity;
import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import br.com.fatecbiblioteca.backend.model.LivroEntity;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
public class EmprestimoDTO {
    private Long Id;
    private LeitorEntity LeitorEntity;
    private LivroEntity LivroEntity;
    private String Movimentacao;
    private LocalDateTime DataMovimentacao;

    public EmprestimoDTO(EmprestimoEntity emprestimoEntity) {
        Id = emprestimoEntity.getId();
        LeitorEntity = emprestimoEntity.getLeitorEntity();
        LivroEntity = emprestimoEntity.getLivroEntity();
        Movimentacao = emprestimoEntity.getMovimentacao();
        DataMovimentacao = emprestimoEntity.getDataMovimentacao();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public br.com.fatecbiblioteca.backend.model.LeitorEntity getLeitorEntity() {
        return LeitorEntity;
    }

    public void setLeitorEntity(br.com.fatecbiblioteca.backend.model.LeitorEntity leitorEntity) {
        LeitorEntity = leitorEntity;
    }

    public br.com.fatecbiblioteca.backend.model.LivroEntity getLivroEntity() {
        return LivroEntity;
    }

    public void setLivroEntity(br.com.fatecbiblioteca.backend.model.LivroEntity livroEntity) {
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
