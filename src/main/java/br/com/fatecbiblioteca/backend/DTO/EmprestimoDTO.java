package br.com.fatecbiblioteca.backend.DTO;

import br.com.fatecbiblioteca.backend.model.EmprestimoEntity;
import br.com.fatecbiblioteca.backend.model.LivroEntity;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
public class EmprestimoDTO {
    private Long Id;
    private Long LeitorId;
    private Long LivroId;
    private String Movimentacao;
    private LocalDateTime DataMovimentacao;

    public EmprestimoDTO(Long id, Long leitorId, Long livroId, String movimentacao, LocalDateTime dataMovimentacao) {
        Id = id;
        LeitorId = leitorId;
        LivroId = livroId;
        Movimentacao = movimentacao;
        DataMovimentacao = dataMovimentacao;
    }

    public EmprestimoDTO(EmprestimoEntity emprestimoEntity) {
        Id = emprestimoEntity.getId();
        LeitorId = emprestimoEntity.getLeitorEntity().getId();
        LivroId = emprestimoEntity.getLivroEntity().getId();
        Movimentacao = emprestimoEntity.getMovimentacao();
        DataMovimentacao = emprestimoEntity.getDataMovimentacao();
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getLeitorId() {
        return LeitorId;
    }

    public void setLeitorId(Long leitorId) {
        LeitorId = leitorId;
    }

    public Long getLivroId() {
        return LivroId;
    }

    public void setLivroId(Long livroId) {
        LivroId = livroId;
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
