package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.service.implementation.LivroService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    LivroController(LivroService _service) {
        service = _service;
    }
}
