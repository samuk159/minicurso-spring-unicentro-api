package br.com.unicentro.minicurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.unicentro.minicurso.model.Aluno;

public interface AlunoRepository extends PagingAndSortingRepository<Aluno, Long> {

}
