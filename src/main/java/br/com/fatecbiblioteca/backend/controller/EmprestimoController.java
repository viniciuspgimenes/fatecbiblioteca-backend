package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.DTO.EmprestimoDTO;
import br.com.fatecbiblioteca.backend.service.contracts.IEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
    private final IEmprestimoService service;

    @Autowired
    public EmprestimoController(IEmprestimoService _service) {
        service = _service;
    }

    @GetMapping
    public List<EmprestimoDTO> listarEmprestimos() {
        return service.listarEmprestimos();
    }

    @GetMapping("/{id}")
    public EmprestimoDTO buscarEmprestimo(@PathVariable Long id) {
        return service.buscarEmprestimo(id);
    }

    @PostMapping
    EmprestimoDTO criarEmprestimo(@RequestBody EmprestimoDTO novoEmprestimo) {
        return service.criarEmprestimo(novoEmprestimo);
    }

    @PutMapping("/{id}")
    EmprestimoDTO atualizarEmprestimo(@RequestBody EmprestimoDTO novoEmprestimo, @PathVariable Long id) {
        return service.atualizarEmprestimo(novoEmprestimo, id);
    }

    @DeleteMapping("/{id}")
    void excluirEmprestimo(@PathVariable Long id) {
        service.excluirEmprestimo(id);
    }
}
