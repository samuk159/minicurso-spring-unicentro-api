package br.com.unicentro.minicurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicentro.minicurso.model.Curso;
import br.com.unicentro.minicurso.repository.CursoRepository;

@RestController
@RequestMapping(path="/cursos")
public class CursoController extends GenericController<Curso, Long> {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public PagingAndSortingRepository<Curso, Long> getRepository() {
		return repository;
	}
	
}
