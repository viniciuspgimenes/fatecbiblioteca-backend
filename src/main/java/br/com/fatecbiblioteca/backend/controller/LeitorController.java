package br.com.fatecbiblioteca.backend.controller;

import br.com.fatecbiblioteca.backend.service.implementation.LeitorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leitores")
public class LeitorController {

    private final LeitorService service;

    LeitorController(LeitorService _service) {
        service = _service;
    }
}
