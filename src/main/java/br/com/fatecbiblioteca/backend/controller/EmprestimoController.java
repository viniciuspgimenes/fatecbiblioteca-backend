package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.service.contracts.IEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private IEmprestimoService service;

    @Autowired
    public EmprestimoController(IEmprestimoService _service) {
        service = _service;
    }
}
