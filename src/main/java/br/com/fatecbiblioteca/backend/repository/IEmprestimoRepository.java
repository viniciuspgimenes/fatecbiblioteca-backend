package br.com.fatecbiblioteca.backend.repository;

import br.com.fatecbiblioteca.backend.model.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

}
