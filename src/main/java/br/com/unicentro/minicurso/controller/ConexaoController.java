package br.com.unicentro.minicurso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/conexao")
public class ConexaoController {

	@GetMapping("/status")
	public String getStatus() {
		return "Status OK";
	}
	
}
