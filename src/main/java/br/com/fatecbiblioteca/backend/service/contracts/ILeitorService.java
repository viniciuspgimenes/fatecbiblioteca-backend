package br.com.fatecbiblioteca.backend.service.contracts;

import br.com.fatecbiblioteca.backend.DTO.LeitorDTO;

import java.util.List;

public interface ILeitorService {
    List<LeitorDTO> listarLeitores();

    LeitorDTO buscarLeitor(Long id);

    LeitorDTO criarLeitor(LeitorDTO novoLeitor);

    LeitorDTO atualizarLeitor(LeitorDTO novoLeitor, Long id);

    void excluirLeitor(Long id);
}
