package br.com.alura.forum.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

    List<Topico> findByCurso_Nome(String nomeCurso);
    
}
