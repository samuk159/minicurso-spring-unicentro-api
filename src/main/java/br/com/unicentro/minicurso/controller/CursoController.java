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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicentro.minicurso.model.Curso;
import br.com.unicentro.minicurso.repository.CursoRepository;

@RestController
@RequestMapping(path="/cursos")
public class CursoController {
	
	@Autowired
	private CursoRepository repository;

	@GetMapping
	public List<Curso> buscarTodos() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Curso> buscarPorId(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping
	public Curso criar(@RequestBody Curso curso) {
		return repository.save(curso);
	}
	
	@PutMapping
	public Curso atualizar(@RequestBody Curso curso) {
		return repository.save(curso);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	
}
