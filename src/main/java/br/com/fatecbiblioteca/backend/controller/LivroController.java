package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.DTO.LivroDTO;
import br.com.fatecbiblioteca.backend.service.contracts.ILivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/livros")
public class LivroController {

    private final ILivroService service;

    LivroController(ILivroService _service) {
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
    LivroDTO criarLivro(@RequestBody LivroDTO novoLivro) {
        return service.criarLivro(novoLivro);
    }

    @PutMapping("/{id}")
    LivroDTO atualizarLivro(@RequestBody LivroDTO novoLivro, @PathVariable Long id) {
        return service.atualizarLivro(novoLivro, id);
    }

    @DeleteMapping("/{id}")
    void excluirLivro(@PathVariable Long id) {
        service.excluirLivro(id);
    }
}
