package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.repository.ILeitorRepository;
import br.com.fatecbiblioteca.backend.service.contracts.ILeitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeitorService implements ILeitorService {
    private final ILeitorRepository repository;

    @Autowired
    LeitorService(ILeitorRepository _repository) {
        repository = _repository;
    }
}
