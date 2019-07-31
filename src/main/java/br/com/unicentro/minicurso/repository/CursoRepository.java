package br.com.unicentro.minicurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicentro.minicurso.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
