package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.repository.ILivroRepository;
import br.com.fatecbiblioteca.backend.service.contracts.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService implements ILivroService {
    private final ILivroRepository repository;

    @Autowired
    LivroService(ILivroRepository _repository) {
        repository = _repository;
    }
}
