package br.com.fatecbiblioteca.backend.repository;

import br.com.fatecbiblioteca.backend.model.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILivroRepository extends JpaRepository<LivroEntity, Long> {

}
