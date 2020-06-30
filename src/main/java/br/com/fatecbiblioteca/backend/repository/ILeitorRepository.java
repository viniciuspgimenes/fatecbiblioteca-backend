package br.com.fatecbiblioteca.backend.repository;

import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILeitorRepository extends JpaRepository<LeitorEntity, Long> {

}
