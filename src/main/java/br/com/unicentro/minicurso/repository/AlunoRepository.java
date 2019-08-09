package br.com.unicentro.minicurso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.unicentro.minicurso.model.Aluno;
import br.com.unicentro.minicurso.model.Curso;

public interface AlunoRepository extends PagingAndSortingRepository<Aluno, Long> {

	public List<Aluno> findByNome(String nome);
	public List<Aluno> findByNomeContaining(String nome);
	public List<Aluno> findByNomeContainingAndPeriodo(String nome, Integer periodo);
	public List<Aluno> findByCurso(Curso curso);
	public List<Aluno> findByCurso_NomeContaining(String cursoNome);
	
}
