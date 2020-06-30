package br.com.fatecbiblioteca.backend.exception;

public class EmprestimoNotFoundException extends RuntimeException {
    public EmprestimoNotFoundException(Long id) {
        super("Empréstimo " + id + " não encontrado!");
    }
}