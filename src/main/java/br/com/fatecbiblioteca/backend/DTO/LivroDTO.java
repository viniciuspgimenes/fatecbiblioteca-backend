package br.com.fatecbiblioteca.backend.DTO;

import br.com.fatecbiblioteca.backend.model.LivroEntity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LivroDTO {
    private Long Id;
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String Ano;
    private String Editora;

    public LivroDTO(LivroEntity livroEntity) {
        Id = livroEntity.getId();
        ISBN = livroEntity.getISBN();
        Titulo = livroEntity.getTitulo();
        Autor = livroEntity.getAutor();
        Ano = livroEntity.getAno();
        Editora = livroEntity.getEditora();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }
}
