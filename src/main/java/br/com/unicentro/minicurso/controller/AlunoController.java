package br.com.unicentro.minicurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicentro.minicurso.model.Aluno;
import br.com.unicentro.minicurso.model.Curso;
import br.com.unicentro.minicurso.repository.AlunoRepository;
import br.com.unicentro.minicurso.repository.CursoRepository;

@RestController
@RequestMapping(path="/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;

	@GetMapping
	public List<Aluno> buscarTodos() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> buscarPorId(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping
	public Aluno criar(@RequestBody Aluno model) {
		return repository.save(model);
	}
	
	@PutMapping
	public Aluno atualizar(@RequestBody Aluno model) {
		return repository.save(model);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	
}
