package br.com.fatecbiblioteca.backend.service.contracts;

import br.com.fatecbiblioteca.backend.DTO.EmprestimoDTO;

import java.util.List;

public interface IEmprestimoService {

    List<EmprestimoDTO> listarEmprestimos();

    EmprestimoDTO buscarEmprestimo(Long id);

//    EmprestimoDTO criarEmprestimo(Long idLeitor, Long idLivro, String movimentacao);
    EmprestimoDTO criarEmprestimo(EmprestimoDTO novoEmprestimo);

    EmprestimoDTO atualizarEmprestimo(EmprestimoDTO novoEmprestimo, Long id);

    void excluirEmprestimo(Long id);

}
