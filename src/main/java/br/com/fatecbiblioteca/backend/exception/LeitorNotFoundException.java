package br.com.fatecbiblioteca.backend.exception;

public class LeitorNotFoundException extends RuntimeException {
    public LeitorNotFoundException(Long id) {
        super("Leitor " + id + " não encontrado!");
    }
}