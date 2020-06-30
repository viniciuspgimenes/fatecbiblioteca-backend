package br.com.fatecbiblioteca.backend;

import br.com.fatecbiblioteca.backend.model.EmprestimoEntity;
import br.com.fatecbiblioteca.backend.model.LeitorEntity;
import br.com.fatecbiblioteca.backend.model.LivroEntity;
import br.com.fatecbiblioteca.backend.repository.IEmprestimoRepository;
import br.com.fatecbiblioteca.backend.repository.ILeitorRepository;
import br.com.fatecbiblioteca.backend.repository.ILivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(ILeitorRepository ILeitorRepository, ILivroRepository ILivroRepository, IEmprestimoRepository IEmprestimoRepository) {
        return args -> {
//            LivroEntity livroEntity1 = new LivroEntity(null, "12345", "Teste 1", "João", "2012", "Nova Era");
//            LeitorEntity leitorEntity1 = new LeitorEntity(null, "Kamilly Isabelly Costa", "075.260.396-51", "Romance");
//
//            ILeitorRepository.deleteAll();
//            System.out.println("Preloading " + ILeitorRepository.save(leitorEntity1));
//            System.out.println("Preloading " + ILeitorRepository.save(new LeitorEntity(null, "Carolina Cláudia Stella Moreira", "561.490.698-34", "Terror")));
//            System.out.println("Preloading " + ILeitorRepository.save(new LeitorEntity(null, "João Carlos", "561.490.698-34", "Suspense")));
//
//            ILivroRepository.deleteAll();
//            System.out.println("Preloading " + ILivroRepository.save(livroEntity1));
//            System.out.println("Preloading " + ILivroRepository.save(new LivroEntity(null, "67890", "Teste 2", "Juan", "2013", "Nova Era Novo")));
//            System.out.println("Preloading " + ILivroRepository.save(new LivroEntity(null, "17395", "Teste 3", "Juli", "2014", "Nova Era Final")));
//
//            IEmprestimoRepository.deleteAll();
//            System.out.println("Preloading " + IEmprestimoRepository.save(new EmprestimoEntity(null, leitorEntity1, livroEntity1, "retirada", LocalDateTime.now())));
        };
    }
}