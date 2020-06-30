package br.com.fatecbiblioteca.backend.service.implementation;

import br.com.fatecbiblioteca.backend.DTO.EmprestimoDTO;
import br.com.fatecbiblioteca.backend.exception.EmprestimoNotFoundException;
import br.com.fatecbiblioteca.backend.exception.LeitorNotFoundException;
import br.com.fatecbiblioteca.backend.exception.LivroNotFoundException;
import br.com.fatecbiblioteca.backend.model.EmprestimoEntity;
import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import br.com.fatecbiblioteca.backend.model.LivroEntity;
import br.com.fatecbiblioteca.backend.repository.IEmprestimoRepository;
import br.com.fatecbiblioteca.backend.repository.ILeitorRepository;
import br.com.fatecbiblioteca.backend.repository.ILivroRepository;
import br.com.fatecbiblioteca.backend.service.contracts.IEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmprestimoService implements IEmprestimoService {
    private final IEmprestimoRepository repository;
    private final ILeitorRepository leitorRepository;
    private final ILivroRepository livroRepository;

    @Autowired
    EmprestimoService(IEmprestimoRepository _repository, ILeitorRepository _leitorRepository, ILivroRepository _livroRepository) {
        repository = _repository;
        leitorRepository = _leitorRepository;
        livroRepository = _livroRepository;
    }

    @Override
    public List<EmprestimoDTO> listarEmprestimos() {
        List<EmprestimoEntity> emprestimos = repository.findAll();

        return emprestimos
                .stream()
                .map(EmprestimoDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public EmprestimoDTO buscarEmprestimo(Long id) {
        EmprestimoEntity emprestimoEntity = repository.findById(id)
                .orElseThrow(() -> new EmprestimoNotFoundException(id));

        return new EmprestimoDTO(emprestimoEntity);
    }

    @Override
    public EmprestimoDTO criarEmprestimo(EmprestimoDTO novoEmprestimo) {
        EmprestimoEntity emprestimoEntity = new EmprestimoEntity();

        LeitorEntity leitor = leitorRepository.findById(novoEmprestimo.getLeitorId())
                .orElseThrow(() -> new LeitorNotFoundException(novoEmprestimo.getLeitorId()));

        LivroEntity livro = livroRepository.findById(novoEmprestimo.getLivroId())
                .orElseThrow(() -> new LivroNotFoundException(novoEmprestimo.getLivroId()));

        emprestimoEntity.setLeitorEntity(leitor);
        emprestimoEntity.setLivroEntity(livro);
        emprestimoEntity.setMovimentacao(novoEmprestimo.getMovimentacao());
        emprestimoEntity.setDataMovimentacao(LocalDateTime.now());
        emprestimoEntity = repository.save(emprestimoEntity);

        return new EmprestimoDTO(emprestimoEntity);
    }

    @Override
    public EmprestimoDTO atualizarEmprestimo(EmprestimoDTO novoEmprestimo, Long id) {
        EmprestimoEntity emprestimoASerAlterado = repository.findById(id)
                .orElseThrow(() -> new EmprestimoNotFoundException(id));

        LeitorEntity leitor = leitorRepository.findById(novoEmprestimo.getLeitorId())
                .orElseThrow(() -> new LeitorNotFoundException(novoEmprestimo.getLeitorId()));

        LivroEntity livro = livroRepository.findById(novoEmprestimo.getLivroId())
                .orElseThrow(() -> new LivroNotFoundException(novoEmprestimo.getLivroId()));

        emprestimoASerAlterado.setLeitorEntity(leitor);
        emprestimoASerAlterado.setLivroEntity(livro);
        emprestimoASerAlterado.setMovimentacao(novoEmprestimo.getMovimentacao());

        return new EmprestimoDTO(repository.save(emprestimoASerAlterado));
    }

    @Override
    public void excluirEmprestimo(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new EmprestimoNotFoundException(id));

        repository.deleteById(id);
    }
}
