package br.com.unicentro.minicurso.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.unicentro.minicurso.model.Aluno;

public abstract class GenericController<T, ID> {

	public abstract PagingAndSortingRepository<T, ID> getRepository();
	
	@GetMapping
	public Iterable<T> buscarTodos() {
		return getRepository().findAll();
	}
	
	@GetMapping("/paginado")
	public Page<T> buscarPaginado(Pageable pageable) {
		return getRepository().findAll(pageable);
	}
	
	@GetMapping("/{id}")
	public Optional<T> buscarPorId(@PathVariable("id") ID id) {
		return getRepository().findById(id);
	}
	
	@PostMapping
	public T criar(@RequestBody T model) {
		return getRepository().save(model);
	}
	
	@PutMapping
	public T atualizar(@RequestBody T model) {
		return getRepository().save(model);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") ID id) {
		getRepository().deleteById(id);
	}
	
}
