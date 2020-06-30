package br.com.fatecbiblioteca.backend.exception;

public class LivroNotFoundException extends RuntimeException {
    public LivroNotFoundException(Long id) {
        super("Livro " + id + " não encontrado!");
    }
}