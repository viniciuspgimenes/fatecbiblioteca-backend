package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.repository.IEmprestimoRepository;
import br.com.fatecbiblioteca.backend.service.contracts.IEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService implements IEmprestimoService {
    private final IEmprestimoRepository repository;

    @Autowired
    EmprestimoService(IEmprestimoRepository _repository) {
        repository = _repository;
    }
}
