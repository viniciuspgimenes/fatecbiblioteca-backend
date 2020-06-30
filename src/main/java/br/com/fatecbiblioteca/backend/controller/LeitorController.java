package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.DTO.LeitorDTO;
import br.com.fatecbiblioteca.backend.service.implementation.LeitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leitores")
public class LeitorController {

    private final LeitorService service;

    LeitorController(LeitorService _service) {
        service = _service;
    }

    @GetMapping
    public List<LeitorDTO> listarLeitores() {
        return service.listarLeitores();
    }

    @GetMapping("/{id}")
    public LeitorDTO buscarLeitor(@PathVariable Long id) {
        return service.buscarLeitor(id);
    }

    @PostMapping
    LeitorDTO criarLeitor(@RequestBody LeitorDTO novoLeitor) {
        return service.criarLeitor(novoLeitor);
    }

    @PutMapping("/{id}")
    LeitorDTO atualizarLeitor(@RequestBody LeitorDTO novoLeitor, @PathVariable Long id) {
        return service.atualizarLeitor(novoLeitor, id);
    }

    @DeleteMapping("/{id}")
    void excluirLeitor(@PathVariable Long id) {
        service.excluirLeitor(id);
    }
}
