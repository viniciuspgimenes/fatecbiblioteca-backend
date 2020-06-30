package br.com.fatecbiblioteca.backend.service.contracts;

import br.com.fatecbiblioteca.backend.DTO.LivroDTO;

import java.util.List;

public interface ILivroService {
    List<LivroDTO> listarLivros();

    LivroDTO buscarLivro(Long id);

    LivroDTO criarLivro(LivroDTO novoLivro);

    LivroDTO atualizarLivro(LivroDTO novoLivro, Long id);

    void excluirLivro(Long id);
}
