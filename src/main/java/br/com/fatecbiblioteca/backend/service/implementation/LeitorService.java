package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.DTO.LeitorDTO;
import br.com.fatecbiblioteca.backend.repository.ILeitorRepository;
import br.com.fatecbiblioteca.backend.service.contracts.ILeitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeitorService implements ILeitorService {
    private final ILeitorRepository repository;

    @Autowired
    LeitorService(ILeitorRepository _repository) {
        repository = _repository;
    }

    @Override
    public List<LeitorDTO> listarLeitores() {
        return null;
    }

    @Override
    public LeitorDTO buscarLeitor(Long id) {
        return null;
    }

    @Override
    public LeitorDTO criarLeitor(LeitorDTO novoLeitor) {
        return null;
    }

    @Override
    public LeitorDTO atualizarLeitor(LeitorDTO novoLeitor, Long id) {
        return null;
    }

    @Override
    public void excluirLeitor(Long id) {

    }
}
