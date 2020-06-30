package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.DTO.LeitorDTO;
import br.com.fatecbiblioteca.backend.exception.LeitorNotFoundException;
import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import br.com.fatecbiblioteca.backend.repository.ILeitorRepository;
import br.com.fatecbiblioteca.backend.service.contracts.ILeitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeitorService implements ILeitorService {
    private final ILeitorRepository repository;

    @Autowired
    LeitorService(ILeitorRepository _repository) {
        repository = _repository;
    }

    @Override
    public List<LeitorDTO> listarLeitores() {
        List<LeitorEntity> leitores = repository.findAll();

        return leitores
                .stream()
                .map(LeitorDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public LeitorDTO buscarLeitor(Long id) {
        LeitorEntity leitorEntity = repository.findById(id)
                .orElseThrow(() -> new LeitorNotFoundException(id));

        return new LeitorDTO(leitorEntity);
    }

    @Override
    public LeitorDTO criarLeitor(LeitorDTO novoLeitor) {
        LeitorEntity leitorEntity = new LeitorEntity();
        leitorEntity.setNome(novoLeitor.getNome());
        leitorEntity.setCpf(novoLeitor.getCpf());
        leitorEntity.setPreferencias(novoLeitor.getPreferencias());

        leitorEntity = repository.save(leitorEntity);

        return new LeitorDTO(leitorEntity);
    }

    @Override
    public LeitorDTO atualizarLeitor(LeitorDTO novoLeitor, Long id) {
        LeitorEntity leitorASerAlterado = repository.findById(id)
                .orElseThrow(() -> new LeitorNotFoundException(id));

        leitorASerAlterado.setNome(novoLeitor.getNome());
        leitorASerAlterado.setCpf(novoLeitor.getCpf());
        leitorASerAlterado.setPreferencias(novoLeitor.getPreferencias());

        return new LeitorDTO(repository.save(leitorASerAlterado));
    }

    @Override
    public void excluirLeitor(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new LeitorNotFoundException(id));

        repository.deleteById(id);
    }
}
