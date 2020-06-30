package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.DTO.LivroDTO;
import br.com.fatecbiblioteca.backend.exception.LivroNotFoundException;
import br.com.fatecbiblioteca.backend.model.LivroEntity;
import br.com.fatecbiblioteca.backend.repository.ILivroRepository;
import br.com.fatecbiblioteca.backend.service.contracts.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService implements ILivroService {
    private final ILivroRepository repository;

    @Autowired
    LivroService(ILivroRepository _repository) {
        repository = _repository;
    }

    @Override
    public List<LivroDTO> listarLivros() {
        List<LivroEntity> livros = repository.findAll();

        return livros
                .stream()
                .map(LivroDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public LivroDTO buscarLivro(Long id) {
        LivroEntity livroEntity = repository.findById(id)
                .orElseThrow(() -> new LivroNotFoundException(id));

        return new LivroDTO(livroEntity);
    }

    @Override
    public LivroDTO criarLivro(LivroDTO novoLivro) {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setISBN(novoLivro.getISBN());
        livroEntity.setTitulo(novoLivro.getTitulo());
        livroEntity.setAutor(novoLivro.getAutor());
        livroEntity.setAno(novoLivro.getAno());
        livroEntity.setEditora(novoLivro.getEditora());

        livroEntity = repository.save(livroEntity);

        return new LivroDTO(livroEntity);
    }

    @Override
    public LivroDTO atualizarLivro(LivroDTO novoLivro, Long id) {
        LivroEntity livroASerAlterado = repository.findById(id)
                .orElseThrow(() -> new LivroNotFoundException(id));

        livroASerAlterado.setAutor(novoLivro.getAutor());
        livroASerAlterado.setAno(novoLivro.getAno());
        livroASerAlterado.setEditora(novoLivro.getEditora());
        livroASerAlterado.setISBN(novoLivro.getISBN());
        livroASerAlterado.setTitulo(novoLivro.getTitulo());

        return new LivroDTO(repository.save(livroASerAlterado));
    }

    @Override
    public void excluirLivro(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new LivroNotFoundException(id));

        repository.deleteById(id);
    }
}