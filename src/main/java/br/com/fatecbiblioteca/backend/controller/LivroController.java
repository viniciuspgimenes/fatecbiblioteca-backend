package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.DTO.LivroDTO;
import br.com.fatecbiblioteca.backend.service.implementation.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    LivroController(LivroService _service) {
        service = _service;
    }

    @GetMapping
    public List<LivroDTO> listarLivros() {
        return service.listarLivros();
    }

    @GetMapping("/{id}")
    public LivroDTO buscarLivro(@PathVariable Long id) {
        return service.buscarLivro(id);
    }

    @PostMapping
    LivroDTO criarLeitor(@RequestBody LivroDTO novoLivro) {
        return service.criarLeitor(novoLivro);
    }

    @PutMapping("/{id}")
    LivroDTO atualizarLeitor(@RequestBody LivroDTO novoLivro, @PathVariable Long id) {
        return service.atualizarLeitor(novoLivro, id);
    }

    @DeleteMapping("/{id}")
    void excluirLivro(@PathVariable Long id) {
        service.excluirLivro(id);
    }
}
