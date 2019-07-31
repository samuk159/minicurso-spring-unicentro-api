package br.com.unicentro.minicurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicentro.minicurso.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
